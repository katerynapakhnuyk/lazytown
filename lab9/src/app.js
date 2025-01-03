const productList = document.getElementById("product-list");
const productForm = document.getElementById("product-form");

function fetchProducts() {
    fetch('/products')
        .then(response => response.json())
        .then(products => {
            productList.innerHTML = products.map(product => `
                <div>
                    <strong>${product.name}</strong> (${product.category}) - $${product.price} (x${product.quantity})
                    <button onclick="deleteProduct(${product.id})">Delete</button>
                </div>
            `).join('');
        });
}

function addProduct(event) {
    event.preventDefault();

    const product = {
        name: document.getElementById("name").value,
        category: document.getElementById("category").value,
        price: parseFloat(document.getElementById("price").value),
        quantity: parseInt(document.getElementById("quantity").value),
    };

    fetch('/products', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(product),
    }).then(() => {
        fetchProducts();
        productForm.reset();
    });
}

function deleteProduct(id) {
    fetch(`/products/${id}`, { method: 'DELETE' })
        .then(() => fetchProducts());
}

productForm.addEventListener("submit", addProduct);
fetchProducts();
