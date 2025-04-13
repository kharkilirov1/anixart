package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
abstract class NodeCursor extends JsonStreamContext {
    public String _currentName;
    public Object _currentValue;
    public final NodeCursor _parent;

    public static final class ArrayCursor extends NodeCursor {
        public Iterator<JsonNode> _contents;
        public JsonNode _currentNode;

        public ArrayCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(1, nodeCursor);
            this._contents = jsonNode.elements();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public boolean currentHasChildren() {
            return ((ContainerNode) currentNode()).size() > 0;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            return this._currentNode;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken endToken() {
            return JsonToken.END_ARRAY;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (!this._contents.hasNext()) {
                this._currentNode = null;
                return null;
            }
            this._index++;
            JsonNode next = this._contents.next();
            this._currentNode = next;
            return next.asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextValue() {
            return nextToken();
        }
    }

    public static final class ObjectCursor extends NodeCursor {
        public Iterator<Map.Entry<String, JsonNode>> _contents;
        public Map.Entry<String, JsonNode> _current;
        public boolean _needEntry;

        public ObjectCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(2, nodeCursor);
            this._contents = ((ObjectNode) jsonNode).fields();
            this._needEntry = true;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public boolean currentHasChildren() {
            return ((ContainerNode) currentNode()).size() > 0;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            Map.Entry<String, JsonNode> entry = this._current;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken endToken() {
            return JsonToken.END_OBJECT;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (!this._needEntry) {
                this._needEntry = true;
                return this._current.getValue().asToken();
            }
            if (!this._contents.hasNext()) {
                this._currentName = null;
                this._current = null;
                return null;
            }
            this._index++;
            this._needEntry = false;
            Map.Entry<String, JsonNode> next = this._contents.next();
            this._current = next;
            this._currentName = next != null ? next.getKey() : null;
            return JsonToken.FIELD_NAME;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextValue() {
            JsonToken nextToken = nextToken();
            return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
        }
    }

    public static final class RootCursor extends NodeCursor {
        public boolean _done;
        public JsonNode _node;

        public RootCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(0, nodeCursor);
            this._done = false;
            this._node = jsonNode;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public boolean currentHasChildren() {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            return this._node;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken endToken() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (this._done) {
                this._node = null;
                return null;
            }
            this._index++;
            this._done = true;
            return this._node.asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextValue() {
            return nextToken();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public void overrideCurrentName(String str) {
        }
    }

    public NodeCursor(int i2, NodeCursor nodeCursor) {
        this._type = i2;
        this._index = -1;
        this._parent = nodeCursor;
    }

    public abstract boolean currentHasChildren();

    public abstract JsonNode currentNode();

    public abstract JsonToken endToken();

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    public final NodeCursor iterateChildren() {
        JsonNode currentNode = currentNode();
        if (currentNode == null) {
            throw new IllegalStateException("No current node");
        }
        if (currentNode.isArray()) {
            return new ArrayCursor(currentNode, this);
        }
        if (currentNode.isObject()) {
            return new ObjectCursor(currentNode, this);
        }
        StringBuilder m24u = C0000a.m24u("Current node of type ");
        m24u.append(currentNode.getClass().getName());
        throw new IllegalStateException(m24u.toString());
    }

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public void overrideCurrentName(String str) {
        this._currentName = str;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final NodeCursor getParent() {
        return this._parent;
    }
}
