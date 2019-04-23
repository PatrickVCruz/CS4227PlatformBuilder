package com.logic.constructor.builder.adapter;


public class BuilderHandler implements IBuilderHandler {

    private IHandler jsonHandler;
    private IHandler xmlHandler;

    public BuilderHandler(){
        jsonHandler = new JSONHandler();
        xmlHandler = new XMLHandler();
    }

    @Override
    public String getData(String filePath, String type) {
        if(type.equals("json"))
            return jsonHandler.getData(filePath);
        else if(type.equals("xml"))
            return xmlHandler.getData(filePath);
        else
            return "Invalid File Type";
    }
}

