# CypherTool

A simple command-line tool for encrypting and decrypting messages using classic ciphers.

## Features

- **ROT13** — a fixed 13-letter shift cipher
- **Atbash** — mirrors the alphabet (A↔Z, B↔Y, etc.)
- **Rail Fence** — rearranges characters in a zigzag pattern across 3 rails

## Build

javac -d build *.java


## Run

java -cp build Main

## Usage

1. Choose an operation: **Encrypt** or **Decrypt**
2. Choose a cipher: **ROT13**, **Atbash**, or **Rail Fence**
3. Enter your message
4. The tool will print the result

Type `exit` at any prompt to quit the program.