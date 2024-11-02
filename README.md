Coinbase Transfer Application
This repository contains both the frontend (Vue.js) and backend (Java Spring Boot) code for the Coinbase Transfer application. The frontend allows users to interact with the backend API to buy, transfer, and sell stablecoins.

Repository Structure
For organization, the frontend and backend are placed in separate folders within this repository.

bash
Copy code
/coinbase-transfer-app
├── README.md                          # Project instructions (this file)
├── coinbase-transfer-frontend         # Frontend (Vue.js)
│   ├── src
│   │   ├── components
│   │   │   └── CoinbaseTransfer.vue   # Main component for transfer operations
│   │   ├── App.vue                    # Main app component
│   │   ├── main.js                    # Entry point for Vue.js
│   │   └── assets                     # (Optional) Static assets like images
│   ├── public
│   │   └── index.html                 # Main HTML template
│   └── package.json                   # Project configuration for frontend
└── coinbase-transfer-backend          # Backend (Java Spring Boot)
    ├── src
    │   └── main
    │       ├── java
    │       │   └── com/example/JavaTestCoinbasePayment
    │       │       ├── JavaTestCoinbasePaymentApplication.java  # Main Spring Boot Application
    │       │       ├── CoinbaseController.java                  # API controller
    │       │       └── CoinbaseService.java                     # Service for handling business logic
    │       └── resources
    │           └── application.properties                       # Backend configuration
    └── pom.xml                                                  # Project configuration for Maven
Instructions for Setup and Running
Prerequisites
Make sure you have the following installed:

Node.js (for the frontend): Download and install from https://nodejs.org/.
Java JDK 8+ (for the backend): Download and install from https://www.oracle.com/java/technologies/javase-downloads.html.
Apache Maven (for building the backend): Download and install from https://maven.apache.org/download.cgi.
1. Setting Up the Backend (Java Spring Boot)
a. Navigate to the Backend Directory
Open a terminal, and navigate to the backend folder:

bash
Copy code
cd path/to/coinbase-transfer-app/coinbase-transfer-backend
b. Configure the Backend
In the src/main/resources/application.properties file, make sure to set up any required configurations, such as the Coinbase API keys and secrets.

c. Run the Backend
Run the backend using Maven:

bash
Copy code
mvn spring-boot:run
The backend server should now be running on http://localhost:8080.

2. Setting Up the Frontend (Vue.js)
a. Navigate to the Frontend Directory
Open a new terminal, and navigate to the frontend folder:

bash
Copy code
cd path/to/coinbase-transfer-app/coinbase-transfer-frontend
b. Install Dependencies
Install the required packages by running:

bash
Copy code
npm install
c. Run the Frontend
Start the frontend development server:

bash
Copy code
npm run serve
The frontend should now be available on http://localhost:8081.

3. Accessing the Application
Frontend: Go to http://localhost:8081 in your browser to access the frontend interface.
Backend: The backend API should be running on http://localhost:8080.
Interaction Between Frontend and Backend
The frontend interacts with the backend API to perform operations such as buying, transferring, and selling stablecoins. Ensure both servers are running for the application to work properly.

File Descriptions
Frontend:

App.vue: The main application file that imports and displays CoinbaseTransfer.vue.
CoinbaseTransfer.vue: Contains the UI and logic for stablecoin operations.
Backend:

JavaTestCoinbasePaymentApplication.java: The main Spring Boot application class that starts the backend server.
CoinbaseController.java: API controller that defines endpoints for the frontend to interact with.
CoinbaseService.java: Contains business logic to handle Coinbase API interactions.

Coinbase Transfer Frontend
This is the frontend for the Coinbase Transfer application. It allows users to buy, transfer, and sell stablecoins through a simple, user-friendly interface.

Project Structure
The project structure follows the standard Vue.js setup. Here’s where to place the main files:

bash
Copy code
/coinbase-transfer-frontend
├── src
│   ├── components
│   │   └── CoinbaseTransfer.vue   # Main component for transfer operations
│   ├── App.vue                    # Main app component
│   ├── main.js                    # Entry point for Vue.js
│   └── assets                     # (Optional) Static assets like images
├── public
│   └── index.html                 # Main HTML template
├── package.json                   # Project configuration
└── README.md                      # Project instructions (this file)
src/components/CoinbaseTransfer.vue: This file contains the main UI component for transfer operations. Place it in the components folder inside src.
src/App.vue: The main application file that imports and displays CoinbaseTransfer.vue. Place it directly in the src folder.
Setup Instructions
1. Prerequisites
Make sure you have the following installed:

Node.js: Download and install from https://nodejs.org/.
Vue CLI (optional): Install globally if you need to create a new Vue project. Run:
bash
Copy code
npm install -g @vue/cli
2. Clone the Repository
If this is part of a larger project, clone the repository and navigate to the frontend folder:

bash
Copy code
git clone https://github.com/your-username/coinbase-transfer-app.git
cd coinbase-transfer-app/coinbase-transfer-frontend
3. Install Dependencies
In the project root directory (coinbase-transfer-frontend), install the necessary dependencies by running:

bash
Copy code
npm install
4. Run the Application
To start the frontend server, run the following command:

bash
Copy code
npm run serve
This will start a development server, usually available at http://localhost:8081.

5. Open the Application in Your Browser
Once the server is running, open your browser and go to the following URL to access the application:

http://localhost:8081

Interacting with the Backend
The frontend interacts with a backend API running on http://localhost:8080. Make sure your backend server is running on this address and port, or update the Axios requests in CoinbaseTransfer.vue if your backend is hosted elsewhere.

File Descriptions
App.vue: This file imports and renders the CoinbaseTransfer component.
CoinbaseTransfer.vue: The main UI component for buying, transferring, and selling stablecoins. This component makes API requests to the backend and displays the responses.
