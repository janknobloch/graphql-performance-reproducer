# code-with-quarkus project

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Running K6 as a reproducer:

Please execute the given files in the k6-testscripts folder using:


```
k6 run json.js
k6 run navigation.js
```

respectively.

Observation:

The runner (VUs) are rapidly increasing using the navigation query schema compared to the json response schema.

The json runner uses:

```
{json}
```

as a query while the navigation runner uses:


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