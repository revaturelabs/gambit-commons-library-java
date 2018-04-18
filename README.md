# gambit-commons-library-java

[![Build Status](https://travis-ci.org/revaturelabs/gambit-commons-library-java.svg?branch=master)](https://travis-ci.org/revaturelabs/gambit-commons-library-java)

Shared resources between gambit services.

## Version Control

In order to create a versioned release, use the following workflow:

#### Development

1. Make any updates or changes to the library on the `develop` branch.

2. Before submitting a pull request to the `master` branch, execute the following command:

    **Major**
    
    This will, for example,  increase the version from _1.1_ to _2.0_.
    
    ```bash
    bash ./bumpversion major
    ```
    
    **Minor**
    
    This will, for example, increase the version from _1.1_ to _1.2_
    
    ```bash
    bash ./bumpversion minor
    ```

3. Make a pull request to the master branch.

Upon merge of the PR into master, a build will kick off on TravisCI that will create a tagged release.