Remote Command Executer

📌 Overview

Remote Command Executer is a client-server based application that allows a client to send system commands to a server machine and receive the execution results over a network.

🚀 Features

- Client-server architecture
- Execute system commands remotely
- Real-time communication
- Simple and easy to use

🛠️ Technologies Used

- Programming Language: Java (ya Python jo tumne use kiya ho)
- Socket Programming
- Networking Concepts

📂 Project Structure

- "Server.java" → Receives and executes commands
- "Client.java" → Sends commands to server

⚙️ Working Principle
The server program starts and waits for a client connection.
The client connects to the server using the IP address and port number.
The client sends a command (e.g., "dir", "ls", etc.).
The server executes the command.
The output is sent back to the client.

▶️ How to Run

Step 1: Compile
javac Server.java
javac Client.java

Step 2: Run Server
java Server

Step 3: Run Client
java Client

Step 4:
- Client me command type karo
- Output screen par show hoga

⚠️ Important Note
This project is created for educational purposes only. Do not use it for unauthorized access or harmful activities.

👤 Author
Snehal Tanpure
