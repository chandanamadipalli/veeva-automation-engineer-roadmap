#!/bin/bash

echo "Files modified in last 3 days:"
find . -type f -mtime -3
