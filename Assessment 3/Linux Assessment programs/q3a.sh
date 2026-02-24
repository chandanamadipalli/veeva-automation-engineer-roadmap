#!/bin/bash

read -p "Enter message to log: " message

echo "$(date) - INFO - $message" >> log.txt

echo "Message logged successfully to log.txt"
