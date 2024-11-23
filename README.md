# <center>Hydrozoa Java Template</center>

> Ready-to-use template for developing VEX V5 robots in Java.

Hydrozoa is an experimental WebAssembly-based runtime that allows VEX V5 robots to run Java and Kotlin.

## Using This Template

To start a project using this template, click the "Use this template" button in the upper right corner of the GitHub repository. Choose an appropriate name and clone the new repository using Git. Finally, open the repository in an IDE such as IntelliJ IDEA.

## Installation

Hydrozoa currently requires you to install a custom command line tool which our Gradle plugin uses to upload programs. On a system with [Rust](https://rustup.rs/) installed, run the following command:

```shell
cargo install --git https://github.com/vexide/hydrozoa-cli.git
```

Now, you can build and upload your program either by activating the "Build & Upload Robot" task from IntelliJ, or running the following command in your terminal:

```shell
./gradlew upload
```

## Resources

Hydrozoa is currently considered experimental, which means you may find that our documentation is sparse. However, you may find the following resources useful:

- Our active & helpful [Discord server](https://discord.gg/ac5x5EUJS8)
- The Hydrozoa section of vexide's [internal documentation](https://internals.vexide.dev/hydrozoa/)
- The source code for [Hydrozoa's Java SDK](https://github.com/vexide/Hydrozoa-Java)
- The source code for [Hydrozoa's runtime](https://github.com/vexide/hydrozoa) (i.e. `hydrozoa.bin`)
- The source code for [Hydrozoa's CLI upload tool](https://github.com/vexide/hydrozoa-cli)
