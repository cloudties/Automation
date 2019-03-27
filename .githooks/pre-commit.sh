#!/usr/bin/env pwsh

# Verify user's Git config has appropriate email address
if ($env:GIT_AUTHOR_EMAIL -notmatch '@(non\.)?cloudties\.in$') {
    Write-Warning "Your Git email address '$env:GIT_AUTHOR_EMAIL' is not configured correctly."
    Write-Warning "It should end with '@cloudties.in' or '@cloudties.in'."
    Write-Warning "Use the command: 'git config --global user.email <name@acme.com>' to set it correctly."
    exit 1
}

exit 0