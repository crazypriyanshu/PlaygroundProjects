## Table per Class : 
1. One Table for each class
2. Each class table has all the attributes including the attributes inherited from Base class


## Single Class : 
1. This will create only 1 table
2. This single class will have attributes across all the entities

## Joined class : 
1. One Table for each class
2. Each class table has only it's attribute.
3. Attributes of parent class are accessed via foreign key to parent class

## Mapped Superclass : 
1. One Table for each inherited class, but no table for parent class
2. All inherited class table has all the attributes + the attributes inherited from Base class
