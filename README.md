# Spring Boot API

## An API that can receive requests on special end points and return data that is well formatted in json from database

### [Localhost](127.0.0.1:8080/) is the default

# Endpoints:

# All endpoints supports this response model:

{
    "data": [
            {
                "category": {
                    "categoryName": "string",
                "id": 0,
                "products": []
            },
            "id": 0,
            "productName": "string",
            "quantityPerUnit": "string",
            "unitPrice": 0,
            unitsInStock": 0
        }
    ],
    "message": "string",
    "success": true
}
    
    1. 127.0.0.1:8080/api/products/add
        - supports post request
        - Example model:
                {
                    "category": {
                        "categoryName": "string",
                        "id": 0,
                        "products": []
                    },
                    "id": 0,
                    "productName": "string",
                    "quantityPerUnit": "string",
                    "unitPrice": 0,
                    "unitsInStock": 0
                }
        - response model:
            {
                message	string
                success	boolean
            }
---
    2. 127.0.0.1/api/products/getall
        - supports only get request
        - Returns all products
        - example call: 127.0.0.1/api/products/getall
            
---
    3. 127.0.0.1/api/products/getByCategoryId
        - supports only get request
        - Returns products based on categoryid
        - example call: http://localhost:8080/api/products/getByCategoryId?categoryId=5
---
    4. 127.0.0.1/api/products/getByProductName
        - supports only get request
        - Returns products based on product name
        - example call: http://localhost:8080/api/products/getByProductName?productName=Chai
---
    5. 127.0.0.1/api/products/getByProductNameAndCategoryId
        - supports only get request
        - Returns products based on product name and category ID
        - example call: http://localhost:8080/api/products/getByProductNameAndCategoryId?categoryId=1&productName=Chai
---
    6. 127.0.0.1/api/products/getProductsByCategoryIdIn
        - supports only get request
        - Returns products based on category ID list
        - example call: http://localhost:8080/api/products/getProductsByCategoryIdIn?categoryIds=1&categoryIds=2
---
    7. 127.0.0.1/api/products/getProductsByProductNameContainingIgnoreCase
        - supports only get request
        - Returns products based on product name that is not fully written
        - is not case sensitive
        - example call: http://localhost:8080/api/products/getProductsByProductNameContainingIgnoreCase?productName=def
---
    8. 127.0.0.1/api/products/getProductsByProductNameOrCategoryId
        - supports only get request
        - Returns products based on product name or category ID
        - example call: http://localhost:8080/api/products/getProductsByProductNameOrCategoryId?categoryId=1&productName=defter
---
    9. 127.0.0.1/api/products/custom
        - supports only get request
        - Returns products based on product name and category ID
        - example call: http://localhost:8080/api/products/custom?id=2&productName=defter
