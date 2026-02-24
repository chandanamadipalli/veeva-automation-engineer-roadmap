
#!/bin/bash

read -p "Enter file name: " file
read -p "Enter word to search: " word

# Check if file exists
if [ ! -f "$file" ]; then
    echo "File does not exist."
    exit 1
fi

# Count occurrences
count=$(grep -o -w "$word" "$file" | wc -l)

if [ "$count" -gt 0 ]; then
    echo "Word '$word' found $count time(s) in $file."
else
    echo "Word not found."
fi
