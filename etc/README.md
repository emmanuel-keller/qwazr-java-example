This directory contains the configuration files.

```json
{
  "controllers": {
    "": "com.qwazr.example.HomeServlet"
  },
  "statics": {
    "/css/*": "src/static/css"
  },
  "library": {
    "freemarker": {
      "class": "com.qwazr.tools.FreeMarkerTool",
      "use_classloader": true
    }
  },
  "schedulers": {
    "my_job": {
      "script_path": "com.qwazr.example.JobRunnable",
      "cron": "*/10 * * * * ?",
      "enabled": true
    }
  }
}
```

### Controllers

The controllers are defined this way:

{route}:{servletClass}

### Statics

QWAZR can directly serves static files (css, js, etc...)

{route}:{file_or_directory_path}

### Library

Defines some optional singleton that can be injected into your code use the **@Library** annotation.

```java
@Library("freemarker")
protected FreeMarkerTool freemarker;
```

### Schedulers

QWAZR includes an internal scheduler (Quartz).
The tasks are declared using the crontab format with the seconds as first parameter.