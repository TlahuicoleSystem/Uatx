export const queries = {
    finAll: 'SELECT * FROM products',
    insert: 'INSERT INTO products set ?',
    update: 'UPDATE products SET ? where id = ?',
    delete: 'DELETE FROM products WHERE id = ?',
}