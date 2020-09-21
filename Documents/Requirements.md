
# Simple Requirements Tool

This document describes the aim for this project and lists all requirements.


## Overview

A computer and software installed on a computer support people in what they do professionally
or for leisure.

In software engineering the process of creating a software starts with elaborating on what
a software is supposed to do, how the software is structured, how the software stores and
displays information, how the computer interacts with a user, etc.. The development process
then continues with implementing the software and testing the software. Professional software
will also be subject to changes. The development process turns into a development cycle.

   Specifiying the software features and functionality
-> implementing the software
-> testing the software
-> fixing bugs
-> changing the specification
-> implementing the changes
-> testing the software
...

Today there are a lot of different tools for managing requirements with different proprietary
data formats. Chosing a tool will lock you into that tool. Changing the tool will result in
a huge migration effort.

Since requirements can and will change over time there is a also need for versioning requirements.

This tool aims to provide a simple methodology for managing and versioning requirements.
Requirements and source code are two sides of the same coin. Thus this approach recommends
managing requirements and source code together. Since requirements will be stored as plain text
files with a limited set of formatting options they will be both human and machine readable.
Requirements will be managed similarly to source code files and versioned using a version control
system of your choice.


## Roadmap

This project aims to provide a reader for requirements first, including some management tools. The
next step is to provide a comfortable editor for your requirements.


## Requirements

R01) Each requirement is stored in a requirement file (i.e. a simple text file). A requirement file
     has a specific configurable file suffix (e.g. *.req).

R02) There are limited formatting options (see examples) for requirements.

R03) Each requirement is placed in a folder. That means in any folder only one requirement file
     exists.

R04) Parent-child relations and requirement-refinement relations between requirements are realized
     via the directory structure. Child requirements are placed in subfolders relative to the parent
     requirement folder. The same applies to refined requirements.

R05) A requirement can have as many child requirements or refinements as needed.

R06) A requirement folder may contain additional documentation (e.g. image, table, etc.) which will
     be embedded into the requirement.

R07) A requirement must have a unique identifier.

F01) A requirement can be divided into sections. There is no limtation as to the number of sections.

F02) Each section name must be unique within a requirement.

F03) A section name is enclosed by brackets.

F04) Brackets should not be used otherwise.

F05) A section name can be any string.

F06) There must be a possibility to embed images. Allowed image formats are: *.svg, *.jpg

F07) There must be a possibility to embed tables. Allowed table formats are: *.csv

F08) A sections starts with a section tag.

F09) A section ends when a new sections starts or the file ends.

V01) A viewer shows a requirement with all specified sections, including embedded images or tables.

V02) The requirement title consists of the directory and the file name of the requirement file.

V03) The viewer has to provide a tree view of all requirements.

T01) There must be a tool or function that performs a cosnsitency check.

T02) A consistency check will generate a consistency report.


## Formatting Examples

[section name]Some text.

[another section name]
Some more text.

[@image:path]
[@table:path]
