#!/bin/bash

read -p "Enter extension (example: txt): " ext

echo "Files with .$ext extension:"
find . -type f -name "*.$ext"
