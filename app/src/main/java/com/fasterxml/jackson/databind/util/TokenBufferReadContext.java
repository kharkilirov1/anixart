package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.json.JsonReadContext;

/* loaded from: classes.dex */
public class TokenBufferReadContext extends JsonStreamContext {
    public String _currentName;
    public Object _currentValue;
    public final JsonStreamContext _parent;
    public final JsonLocation _startLocation;

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext, Object obj) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        if (jsonStreamContext instanceof JsonReadContext) {
            this._startLocation = ((JsonReadContext) jsonStreamContext).getStartLocation(obj);
        } else {
            this._startLocation = JsonLocation.f8863NA;
        }
    }

    public static TokenBufferReadContext createRootContext(JsonStreamContext jsonStreamContext) {
        return jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, (JsonLocation) null);
    }

    public TokenBufferReadContext createChildArrayContext() {
        this._index++;
        return new TokenBufferReadContext(this, 1, -1);
    }

    public TokenBufferReadContext createChildObjectContext() {
        this._index++;
        return new TokenBufferReadContext(this, 2, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonStreamContext getParent() {
        return this._parent;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    public TokenBufferReadContext parentOrCopy() {
        JsonStreamContext jsonStreamContext = this._parent;
        return jsonStreamContext instanceof TokenBufferReadContext ? (TokenBufferReadContext) jsonStreamContext : jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, this._startLocation);
    }

    public void setCurrentName(String str) throws JsonProcessingException {
        this._currentName = str;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public void updateForValue() {
        this._index++;
    }

    public TokenBufferReadContext(JsonStreamContext jsonStreamContext, JsonLocation jsonLocation) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        this._startLocation = jsonLocation;
    }

    public TokenBufferReadContext() {
        super(0, -1);
        this._parent = null;
        this._startLocation = JsonLocation.f8863NA;
    }

    public TokenBufferReadContext(TokenBufferReadContext tokenBufferReadContext, int i2, int i3) {
        super(i2, i3);
        this._parent = tokenBufferReadContext;
        this._startLocation = tokenBufferReadContext._startLocation;
    }
}
