#!/bin/bash

cd shopfront
#mvn clean install
if docker build -t rishabh050189/djshopfront:latest . ; then
  docker push rishabh050189/djshopfront:latest
fi
cd ..

cd productcatalogue
#mvn clean install
if docker build -t rishabh050189/djproductcatalogue:latest . ; then
  docker push rishabh050189/djproductcatalogue:latest
fi
cd ..

cd stockmanager
#mvn clean install
if docker build -t rishabh050189/djstockmanager:latest . ; then
  docker push rishabh050189/djstockmanager:latest
fi
cd ..
