#!/bin/bash

read -p "Enter file name: " filename

if [ -f "$filename" ]; then
    echo "$(date) - INFO - File '$filename' accessed successfully" >> log.txt
    cat "$filename"
else
    echo "$(date) - ERROR - File '$filename' not found" >> errorlog.txt
fi
