#!/bin/bash

read -p "Enter HTML file name: " file
read -p "Enter tag name (example: title): " tag

if [ -f "$file" ]; then
    echo "Extracting content inside <$tag>...</$tag>"
    sed -n "s:.*<$tag>\(.*\)</$tag>.*:\1:p" "$file"
else
    echo "File does not exist."
fi
