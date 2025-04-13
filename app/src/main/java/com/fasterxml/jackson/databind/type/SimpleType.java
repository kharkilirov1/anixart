package com.fasterxml.jackson.databind.type;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), null, null);
    }

    private static JavaType _buildSuperClass(Class<?> cls, TypeBindings typeBindings) {
        if (cls == null) {
            return null;
        }
        return cls == Object.class ? TypeFactory.unknownType() : new SimpleType(cls, typeBindings, _buildSuperClass(cls.getSuperclass(), typeBindings), null, null, null, false);
    }

    @Deprecated
    public static SimpleType construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0576a.m4116o(cls, C0000a.m24u("Cannot construct SimpleType for a Map (class: "), ")"));
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0576a.m4116o(cls, C0000a.m24u("Cannot construct SimpleType for a Collection (class: "), ")"));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(C0576a.m4116o(cls, C0000a.m24u("Cannot construct SimpleType for an array (class: "), ")"));
        }
        TypeBindings emptyBindings = TypeBindings.emptyBindings();
        return new SimpleType(cls, emptyBindings, _buildSuperClass(cls.getSuperclass(), emptyBindings), null, null, null, false);
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this._class;
        if (superclass == cls3) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        if (superclass != null && cls3.isAssignableFrom(superclass)) {
            return new SimpleType(cls, this._bindings, _narrow(superclass), null, this._valueHandler, this._typeHandler, this._asStatic);
        }
        for (Class<?> cls4 : cls.getInterfaces()) {
            Class<?> cls5 = this._class;
            if (cls4 == cls5) {
                return new SimpleType(cls, this._bindings, null, new JavaType[]{this}, this._valueHandler, this._typeHandler, this._asStatic);
            }
            if (cls5.isAssignableFrom(cls4)) {
                return new SimpleType(cls, this._bindings, null, new JavaType[]{_narrow(cls4)}, this._valueHandler, this._typeHandler, this._asStatic);
            }
        }
        StringBuilder m24u = C0000a.m24u("Internal error: Cannot resolve sub-type for Class ");
        C0576a.m4126y(cls, m24u, " to ");
        m24u.append(this._class.getName());
        throw new IllegalArgumentException(m24u.toString());
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i2 = 0; i2 < size; i2++) {
                JavaType containedType = containedType(i2);
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(containedType.toCanonical());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return TypeBase._classSignature(this._class, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i2 = 0; i2 < size; i2++) {
                sb = containedType(i2).getGenericSignature(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(buildCanonicalName());
        sb.append(']');
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withTypeHandler(Object obj) {
        return this._typeHandler == obj ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    public SimpleType(TypeBase typeBase) {
        super(typeBase);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i2, obj, obj2, z);
    }
}
