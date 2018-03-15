package com.code_envolved.ui.Models;

import processing.core.PApplet;

public class Rectangle {
    private Vec2 _position;
    private Vec2 _offset;
    private Vec2 _bounds;

    public Rectangle(){
        _position = new Vec2();
        _bounds = new Vec2();
        _offset = new Vec2();
    }

    public Rectangle(float x, float y, float sx, float sy){
        _position = new Vec2(x,y);
        _bounds = new Vec2(sx,sy);
        _offset = new Vec2();
    }

    public Rectangle(Vec2 pos, Vec2 bounds){
        _position = new Vec2(pos);
        _bounds = new Vec2(bounds);
        _offset = new Vec2();
    }

    public Vec2 getAbsolutePosition() {
        return _position;
    }

    public Vec2 getBounds() {
        return _bounds;
    }

    public void setRelativePosition(Vec2 pos){
        _position = new Vec2(pos);
    }

    public void setBounds(Vec2 bounds){
        _bounds = new Vec2(bounds);
    }

    public void setRelativePosition(float x, float y){
        _position = new Vec2(x,y);
    }

    public void setBounds(float x, float y){
        _bounds = new Vec2(x,y);
    }

    public void setRelativePositionX(float x){
        _position = new Vec2(x, _position.y());
    }

    public void setRelativePositionY(float y){
        _position = new Vec2(_position.x(), y);
    }

    public void setBoundsX(float x){
        _bounds = new Vec2(x, _bounds.y());
    }

    public void setBoundsY(float y){
        _bounds = new Vec2(_bounds.x(), y);
    }

    public float x(){
        return (_position.add(_offset)).x();
    }

    public float y(){
        return (_position.add(_offset)).y();
    }

    public float width(){
        return _bounds.x();
    }

    public float height(){
        return _bounds.y();
    }

    public void setOffset(Vec2 offset){
        this._offset = offset;
    }

    public boolean isOnRect(Vec2 pos){
        Vec2 rightBottomCorner = _position.add(_bounds);
        return PApplet.constrain(pos.x(), _position.x(), rightBottomCorner.x()) == pos.x() &&
        PApplet.constrain(pos.y(), _position.y(), rightBottomCorner.y()) == pos.y();
    }

}
