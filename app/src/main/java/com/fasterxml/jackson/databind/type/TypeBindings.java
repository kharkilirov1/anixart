package com.fasterxml.jackson.databind.type;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    public static final class AsKey {
        private final int _hash;
        private final JavaType[] _params;
        private final Class<?> _raw;

        public AsKey(Class<?> cls, JavaType[] javaTypeArr, int i2) {
            this._raw = cls;
            this._params = javaTypeArr;
            this._hash = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != AsKey.class) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this._hash == asKey._hash && this._raw == asKey._raw) {
                JavaType[] javaTypeArr = asKey._params;
                int length = this._params.length;
                if (length == javaTypeArr.length) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!this._params[i2].equals(javaTypeArr[i2])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this._hash;
        }

        public String toString() {
            return C0576a.m4116o(this._raw, new StringBuilder(), "<>");
        }
    }

    public static class TypeParamStash {
        private static final TypeVariable<?>[] VARS_ABSTRACT_LIST = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_COLLECTION = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ITERABLE = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LIST = List.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ARRAY_LIST = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_MAP = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_HASH_MAP = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LINKED_HASH_MAP = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
            return cls == Collection.class ? VARS_COLLECTION : cls == List.class ? VARS_LIST : cls == ArrayList.class ? VARS_ARRAY_LIST : cls == AbstractList.class ? VARS_ABSTRACT_LIST : cls == Iterable.class ? VARS_ITERABLE : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
            return cls == Map.class ? VARS_MAP : cls == HashMap.class ? VARS_HASH_MAP : cls == LinkedHashMap.class ? VARS_LINKED_HASH_MAP : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            StringBuilder m24u = C0000a.m24u("Mismatching names (");
            m24u.append(strArr.length);
            m24u.append("), types (");
            throw new IllegalArgumentException(C0000a.m18o(m24u, javaTypeArr.length, ")"));
        }
        int length = javaTypeArr.length;
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            i2 += this._types[i3].hashCode();
        }
        this._unboundVariables = strArr2;
        this._hashCode = i2;
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(NO_TYPES));
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        StringBuilder m24u = C0000a.m24u("Cannot create TypeBindings for class ");
        m24u.append(cls.getName());
        m24u.append(" with 1 type parameter: class expects ");
        m24u.append(length);
        throw new IllegalArgumentException(m24u.toString());
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    public Object asKey(Class<?> cls) {
        return new AsKey(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i2 = 0; i2 < length; i2++) {
            if (!javaTypeArr[i2].equals(this._types[i2])) {
                return false;
            }
        }
        return true;
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(this._names[i2])) {
                JavaType javaType = this._types[i2];
                return (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) ? javaType : selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i2) {
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public JavaType getBoundType(int i2) {
        if (i2 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i2 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i2];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        return javaTypeArr.length == 0 ? Collections.emptyList() : Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? EMPTY : this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder m2872a = C0321a.m2872a('<');
        int length = this._types.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                m2872a.append(',');
            }
            m2872a.append(this._types[i2].getGenericSignature());
        }
        m2872a.append('>');
        return m2872a.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                strArr[i2] = typeParameters[i2].getName();
            }
        } else {
            strArr = NO_STRINGS;
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder m24u = C0000a.m24u("Cannot create TypeBindings for class ");
            C0576a.m4126y(cls, m24u, " with ");
            m24u.append(javaTypeArr.length);
            m24u.append(" type parameter");
            m24u.append(javaTypeArr.length == 1 ? "" : "s");
            m24u.append(": class expects ");
            m24u.append(strArr.length);
            throw new IllegalArgumentException(m24u.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (javaTypeArr == null) {
                javaTypeArr = NO_TYPES;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = typeParameters[i2].getName();
            }
            if (length != javaTypeArr.length) {
                StringBuilder m24u = C0000a.m24u("Cannot create TypeBindings for class ");
                C0576a.m4126y(cls, m24u, " with ");
                m24u.append(javaTypeArr.length);
                m24u.append(" type parameter");
                m24u.append(javaTypeArr.length == 1 ? "" : "s");
                m24u.append(": class expects ");
                m24u.append(length);
                throw new IllegalArgumentException(m24u.toString());
            }
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        return EMPTY;
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] paramsFor1 = TypeParamStash.paramsFor1(cls);
        int length = paramsFor1 == null ? 0 : paramsFor1.length;
        if (length == 1) {
            return new TypeBindings(new String[]{paramsFor1[0].getName()}, new JavaType[]{javaType}, null);
        }
        StringBuilder m24u = C0000a.m24u("Cannot create TypeBindings for class ");
        m24u.append(cls.getName());
        m24u.append(" with 1 type parameter: class expects ");
        m24u.append(length);
        throw new IllegalArgumentException(m24u.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] paramsFor2 = TypeParamStash.paramsFor2(cls);
        int length = paramsFor2 == null ? 0 : paramsFor2.length;
        if (length == 2) {
            return new TypeBindings(new String[]{paramsFor2[0].getName(), paramsFor2[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        StringBuilder m24u = C0000a.m24u("Cannot create TypeBindings for class ");
        m24u.append(cls.getName());
        m24u.append(" with 2 type parameters: class expects ");
        m24u.append(length);
        throw new IllegalArgumentException(m24u.toString());
    }
}
