const newProduct = {
    id: Date.now(), // Генерує унікальний ID
    name,
    quantity,
    price
};


// Load all products on page load
window.onload = function () {
    fetch(API_URL)
        .then(response => response.json())
        .then(data => loadProducts(data))
        .catch(error => console.error('Error loading products:', error));
};

// Add a new product
document.getElementById('add-product-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const name = document.getElementById('product-name').value;
    const quantity = document.getElementById('product-quantity').value;
    const price = document.getElementById('product-price').value;

    if (!name || !quantity || !price) {
        alert('Please fill out all fields!');
        return;
    }

    const newProduct = { name, quantity: parseInt(quantity, 10), price: parseFloat(price) };

    document.getElementById('add-product-form').addEventListener('submit', function (e) {
        e.preventDefault();

        const name = document.getElementById('product-name').value;
        const quantity = document.getElementById('product-quantity').value;
        const price = document.getElementById('product-price').value;

        const newProduct = { id: Date.now(), name, quantity, price };

        loadProduct(newProduct); // Додаємо одразу
        alert('Product added successfully!');
    });

// Function to display all products
function loadProducts(products) {
    const tbody = document.getElementById('products');
    tbody.innerHTML = ''; // Clear the table
    products.forEach(product => loadProduct(product));
}

// Function to display a single product
function loadProduct(product) {
    const tbody = document.getElementById('products');
    const row = document.createElement('tr');

    row.innerHTML = `
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.quantity}</td>
        <td>${product.price.toFixed(2)}</td>
    `;
    tbody.appendChild(row);
}
