# Shopping platform 

## Description
The app calculates a total price for a single product. Also, it supports applying discounts on them. For now, there are two kind of discounts, **percentage** and **quantity based**.


## Requirements
- installed [docker](https://www.docker.com/)

## Run
```bash
docker compose up -d 
```

Now the application is up and running, it's available via port 8080 on localhost. 

## Functionalities
### Core
`POST /v1/order/preview` - calculate a price for a product specified in body including quantity and discounts

### Helpers
- `POST /v1/product` - allows to create a product 
- `POST /v1/discount` - allows to create a discount (percentage or quantity based)
- `GET /v1/product/{id}` - get a product details 
- `DELETE /v1/product/{id}` - remove a product
- `GET /v1/product` - get all products

Each endpoint is listed in postman collection included in folder named `postman` in root directory. Feel free to play around!

