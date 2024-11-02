<template>
  <div id="app">
    <!-- This renders the CoinbaseTransfer component -->
    <CoinbaseTransfer />
  </div>
</template>

<script>
// Import the CoinbaseTransfer component from the components folder
import CoinbaseTransfer from './components/CoinbaseTransfer.vue';

export default {
  components: {
    CoinbaseTransfer,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
