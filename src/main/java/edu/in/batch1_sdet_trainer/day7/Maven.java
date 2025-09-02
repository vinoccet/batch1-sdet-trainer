package edu.in.batch1_sdet_trainer.day7;

public class Maven {

    // Maven is a build tool
    // Maven is a dependency management tool
    // maven is a project management tool
    // standardized approach for building software
    // command line tool
    // IDE integration

    /*
    Build tools:
    Creates and deployable artifacts from source code
    Automated/ repeatable builds
    Deploying artifacts on server
    IDE independence
    Integration with other build tools
     */

    /*
    Dependency Management:
    Download project dependencies from centralized repo
    Automatically resolves the libraries required by the project dependency
    Dependency scoping
     */

    /*
    Project Management:
    Artifact versioning
    Change logs
    Documentation
    Javadocs
    Reports
     */


    /*
    Project Object Model POM
    Describes, configures and customizes a maven project
    Maven reads the pom.xml file to build  a project
    Defines the address  for the project artifacts using a coordinate system
    specifies project information, plugins, goals, dependencies and  profiles
     */

    /*
    Repositories:
    Local (local cache)
    Remote repositories
    Local>remote
    */

    /*
    Plugins and goals
    Example: compiler plugin
    Goals perform action in maven builds
    All work is done via plugin and goals,
    called independently or as a part of lifecycle phase
     */

    /*
    clean, default, site

    Lifecycle and phases:
    Lifecycle is a sequence of named phases
    Phases are executed sequentially
    3 life cycles: clean, default, site
    Executing phase executes all previous phases
     */

    /*
    How it works overview: mvn install
    POM, Dependency Manager, Lifecycle
    POM [   Project information, Dependencies, Plugins(Actions that will happen with our sourcecode)]
    Dependency Manager: [plugin, dependency]-> repositories(maven or nexus)
    Lifecycle: for install previous pahases are Compile and test

    Note : plugins and goals are related to phases in lifecycle, example 1st plugin
    at compile and test phase and next plugin at install phase


     */

}
/*
name , desc,url, liscences->liscence->name and comments, organization->name and url
developers->developer->name,email
mvn site
mvn compile

     Maven standard directory layout:
     https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
     for configuration go with build tag

 Inheritence:
 pom inheritence , super pom
 mvn help:effective-pom
 parent tag-> artifactid-grupid-versin and packaging is pom

 Profiles:
 profiles->profile->id,
 mvn -pprod package

 life cycle:
 mvv describe Dcmd=clean
 default life cycle = 23 phases
 its based on packaging example for jas its different goals and war its different goals
 deploy is mostly last
 can give multiple phases as well. mvn clean install

 compile:
 test compile:
 test: run test using a suitable unit testing framework,
 these test not require packaged or deploy
 package: compile+distributable format such as jar
 intsall: compile+distributable format such as jar+install in
 local reposo that other projects can use it
 Deploy: done in integration or release env

 surefire plugin for test: mvn install -Dmaven.test.skip=true
 build->pluginmanagement->plugins->plugin
 <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.19.1</version>
    <configuration>
        <testFailureIgnore>true</testFailureIgnore>
    </configuration>
</plugin>
 */