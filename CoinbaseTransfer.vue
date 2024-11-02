<template>
  <div class="container">
    <h1>Coinbase Transfer Operations</h1>

    <!-- Buy Stablecoin Section -->
    <div class="section">
      <h2>Buy Stablecoin</h2>
      <div class="form-group">
        <input v-model="buy.accountId" placeholder="Account ID" />
        <input v-model="buy.amount" type="number" placeholder="Amount" />
        <input v-model="buy.currency" placeholder="Currency (e.g., USDC)" />
        <button @click="buyStablecoin" class="btn">Buy</button>
      </div>
    </div>

    <!-- Transfer Stablecoin Section -->
    <div class="section">
      <h2>Transfer Stablecoin</h2>
      <div class="form-group">
        <input v-model="transfer.fromAccountId" placeholder="From Account ID" />
        <input v-model="transfer.toAddress" placeholder="To Address" />
        <input v-model="transfer.amount" type="number" placeholder="Amount" />
        <input v-model="transfer.currency" placeholder="Currency (e.g., USDC)" />
        <button @click="transferStablecoin" class="btn">Transfer</button>
      </div>
    </div>

    <!-- Sell Stablecoin Section -->
    <div class="section">
      <h2>Sell Stablecoin</h2>
      <div class="form-group">
        <input v-model="sell.accountId" placeholder="Account ID" />
        <input v-model="sell.amount" type="number" placeholder="Amount" />
        <input v-model="sell.currency" placeholder="Currency (e.g., USDC)" />
        <button @click="sellStablecoin" class="btn">Sell</button>
      </div>
    </div>

    <!-- Status Message -->
    <div v-if="statusMessage" class="status-message">
      <h3>Status</h3>
      <p>{{ statusMessage }}</p>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      buy: { accountId: '', amount: '', currency: 'USDC' },
      transfer: { fromAccountId: '', toAddress: '', amount: '', currency: 'USDC' },
      sell: { accountId: '', amount: '', currency: 'USDC' },
      statusMessage: ''
    };
  },
  methods: {
    async buyStablecoin() {
      try {
        const response = await axios.post('http://localhost:8080/api/coinbase/buy', this.buy);
        this.statusMessage = `Buy Success: ${JSON.stringify(response.data)}`;
      } catch (error) {
        this.statusMessage = `Buy Failed: ${error.message}`;
      }
    },
    async transferStablecoin() {
      try {
        const response = await axios.post('http://localhost:8080/api/coinbase/transfer', this.transfer);
        this.statusMessage = `Transfer Success: ${JSON.stringify(response.data)}`;
      } catch (error) {
        this.statusMessage = `Transfer Failed: ${error.message}`;
      }
    },
    async sellStablecoin() {
      try {
        const response = await axios.post('http://localhost:8080/api/coinbase/sell', this.sell);
        this.statusMessage = `Sell Success: ${JSON.stringify(response.data)}`;
      } catch (error) {
        this.statusMessage = `Sell Failed: ${error.message}`;
      }
    }
  }
};
</script>

<style scoped>
/* General Styling */
.container {
  max-width: 500px;
  margin: auto;
  padding: 20px;
  background-color: #f9f9f9;
  border-radius: 12px;
  box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
  font-family: Arial, sans-serif;
}

h1 {
  text-align: center;
  font-size: 24px;
  color: #333;
  margin-bottom: 20px;
}

.section {
  margin-bottom: 20px;
}

h2 {
  font-size: 18px;
  color: #007bff;
  margin-bottom: 10px;
}

/* Form Styling */
.form-group {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

input {
  padding: 12px;
  border: 1px solid #ddd;
  border-radius: 6px;
  font-size: 14px;
  width: 100%;
  box-sizing: border-box;
}

input:focus {
  border-color: #007bff;
  outline: none;
  box-shadow: 0px 0px 5px rgba(0, 123, 255, 0.5);
}

/* Button Styling */
.btn {
  background-color: #007bff;
  color: white;
  border: none;
  padding: 12px;
  border-radius: 6px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.3s;
  width: 100%;
}

.btn:hover {
  background-color: #0056b3;
}

/* Status Message */
.status-message {
  margin-top: 20px;
  padding: 10px;
  border-radius: 6px;
  background-color: #e0f7fa;
  color: #00796b;
  text-align: center;
  font-weight: bold;
}
</style>
