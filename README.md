# code-with-quarkus project

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Running K6 as a reproducer:

Please execute the given files in the k6-testscripts folder using:


```
k6 run graphql-navigation.js
k6 run graphql-navigation-json.js
k6 run rest-navigation.js
```

respectively.

Observation:

The runner (VUs) are rapidly increasing using the navigation query schema compared to the json response schema.

The json runner uses the following query:

```
{json}
```

while the navigation runner uses the following query:


```
{
  navigation {
    name
    channel
    cssActive
    url
    path
    children {
      name
      channel
      cssActive
      url
      path
      children {
        name
        channel
        cssActive
        url
        path
        children {
          name
          channel
          cssActive
          url
          path
        }
      }
    }
  }
}


```


Graphql using json query results:  
![alt text](https://github.com/janknobloch/graphql-performance-reproducer/blob/master/k6-testscripts/graphql-navigation-json-results.png "")

Graphql using internal query results:  
![alt text](https://github.com/janknobloch/graphql-performance-reproducer/blob/master/k6-testscripts/graphql-navigation-results.png "")

REST using a simple rest query results:  
![alt text](https://github.com/janknobloch/graphql-performance-reproducer/blob/master/k6-testscripts/rest-navigation-results.png "")
