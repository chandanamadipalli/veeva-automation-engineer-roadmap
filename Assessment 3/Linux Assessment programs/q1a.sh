#!/bin/bash

read -p "Enter file name: " filename

# Check in current directory
if [ -f "$filename" ]; then
    echo "File exists in current directory."
else
    echo "File does NOT exist in current directory."
fi

echo "Searching entire system (C drive)..."

# Search entire C drive (Git Bash format)
result=$(find /c -type f -name "$filename" 2>/dev/null)

if [ -z "$result" ]; then
    echo "File not found in system."
else
    echo "File found at:"
    echo "$result"
fi
