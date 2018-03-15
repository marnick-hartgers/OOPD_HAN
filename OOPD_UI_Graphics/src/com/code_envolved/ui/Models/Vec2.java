package com.code_envolved.ui.Models;

public class Vec2 {

    private float _x;
    private float _y;

    public Vec2(){}

    public Vec2(float x, float y){
        this._x = x;
        this._y = y;
    }

    public Vec2(float p){
        this._x = p;
        this._y = p;
    }

    public Vec2(Vec2 v){
        this._x = v._x;
        this._y = v._y;
    }

    public float x(){
        return _x;
    }

    public float y(){
        return _y;
    }

    public Vec2 add(Vec2 v){
        return new Vec2(_x + v._x, _y + v._y);
    }
    public Vec2 substract(Vec2 v){
        return new Vec2(_x - v._x, _y - v._y);
    }
    public Vec2 multiply(Vec2 v){
        return new Vec2(_x * v._x, _y * v._y);
    }
    public Vec2 divide (Vec2 v){
        return new Vec2(_x / v._x, _y / v._y);
    }
}
