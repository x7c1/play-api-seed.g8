# play-api-seed.g8

Template to start developing API on Play Framework.

```
$ sbt new x7c1/play-api-seed.g8
```

To skip the interaction:

```
$ sbt new x7c1/play-api-seed.g8 \
--name=foo-api \
--organization=sample \
--app_prefix=foo
```

Run a test:

```
$ cd ./foo-api
$ sbt
sbt:foo-root> foo-play/test
[info] ...
[info] Passed: Total 1, Failed 0, Errors 0, Passed 1
[success] ...
```

Run a development server:

```
sbt:foo-root> foo-play/run
...
[info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000
...
```

Call API method:

```
$ curl http://localhost:9000/hello
Hello, foo-api!
```

## File structures

```
$ tree -I '.git|.idea|target' -a ./foo-api
./foo-api
├── .gitignore
├── build.sbt
├── foo-domain
│   └── src
│       └── main
│           └── scala
│               └── sample
│                   └── foo
│                       └── domain
│                           └── Greeting.scala
├── foo-play
│   ├── app
│   │   └── controllers
│   │       └── HelloController.scala
│   ├── conf
│   │   ├── application.conf
│   │   └── routes
│   └── test
│       └── controllers
│           └── HelloControllerSpec.scala
└── project
    ├── FooSettings.scala
    ├── build.properties
    └── plugins.sbt
```

## License

This repository is published under the MIT License.
