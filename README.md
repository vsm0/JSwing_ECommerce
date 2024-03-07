# ATTENTION

**TLDR: This project is now abandoned by me (op) because I broke it and won't-fix it**

I was exploring build systems to speed up my workflow, but trying to integrate it into this project was less than enjoyable. Plus, coding other prototypes and my failed attempt to patch this codebase revealed several glaring flaws.

Thus, moving forward, this repo is being abandoned. I will recreate/improve it from scratch in a new repo while taking what I've learned and putting it to good use, namely, a codebase devoid of obvious malpractice and one that I'm satisfied with.

# Description

This repo contains the source code, assets and Makefile for the e-commerce app for ITE104.

It uses Java AWT/Swing, with a layer of abstraction to make coding the UI easier and more consistent.

## Current Status

The project so far is just a **mockup**, so no actual functionality. The only features that exist are to demonstrate the design and may or may not be changed/removed in future iterations.

![Screenshot](assets/screenshot.png)

# Building

**java** and **javac** must be installed.
**make** is optional to make compiling easier.

Using **make**:

type

```bash
make
```

or 

```bash
make build
make run
```

This will build and run the project.

The first method cleans the build files after the program exits. Using the second methods means you need to manually clean them.

To clean the generated files:

```bash
make clean
```

If **make** is not installed, then just type the commands manually. The Makefile contains the necessary commands

