#!/usr/bin/env pwsh


# Verify user's Git config has appropriate email address
if ($env:GIT_AUTHOR_EMAIL -notmatch '@(non\.)?cloudties\.in$') {
    Write-Warning "Your Git email address '$env:GIT_AUTHOR_EMAIL' is not configured correctly."
    Write-Warning "It should end with '@cloudties.in' or '@cloudties.in'."
    Write-Warning "Use the command: 'git config --global user.email <name@acme.com>' to set it correctly."
    exit 1
}


if [ -z "$GIT_AUTHOR_DATE" ]; then  # it's blank (testing standalone):
   GIT_AUTHOR_DATE="@1522308872 -0600" # provide sample input
   GIT_AUTHOR_NAME="Wilson Mar"
   GIT_AUTHOR_EMAIL="WilsonMar@gmail.com"
fi
   #echo "GIT_AUTHOR_DATE=$GIT_AUTHOR_DATE"
GIT_AUTHOR_YMD=${GIT_AUTHOR_DATE#"@"}  # # refers to the beginning char to strip.
GIT_AUTHOR_YMD=${GIT_AUTHOR_YMD%' '*} # strips chars from end of string after the space.
GIT_AUTHOR_YMD=$(date -r "$GIT_AUTHOR_YMD" '+%Y-%m-%dT%H:%M:%S')  # ISO 8601 format
time=${GIT_AUTHOR_DATE:(-5)} # extracts last 5 chars from end of string.
GIT_AUTHOR_TZ=${time:0:3}:${time:3:2}
echo "pre-commit $GIT_AUTHOR_YMD$GIT_AUTHOR_TZ for $GIT_AUTHOR_NAME of $GIT_AUTHOR_EMAIL"
exit 0  # 1 is error.

