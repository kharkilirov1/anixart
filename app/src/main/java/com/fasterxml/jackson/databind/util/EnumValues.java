package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private transient EnumMap<?, SerializableString> _asMap;
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        return serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(serializationConfig, cls) : constructFromName(serializationConfig, cls);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> findEnumType = ClassUtil.findEnumType(cls);
        Enum<?>[] enumArr = (Enum[]) findEnumType.getEnumConstants();
        if (enumArr == null) {
            StringBuilder m24u = C0000a.m24u("Cannot determine enum constants for Class ");
            m24u.append(cls.getName());
            throw new IllegalArgumentException(m24u.toString());
        }
        String[] findEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(findEnumType, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Enum<?> r5 = enumArr[i2];
            String str = findEnumValues[i2];
            if (str == null) {
                str = r5.name();
            }
            serializableStringArr[r5.ordinal()] = mapperConfig.compileString(str);
        }
        return new EnumValues(cls, serializableStringArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            StringBuilder m24u = C0000a.m24u("Cannot determine enum constants for Class ");
            m24u.append(cls.getName());
            throw new IllegalArgumentException(m24u.toString());
        }
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        for (Enum r4 : enumArr) {
            serializableStringArr[r4.ordinal()] = mapperConfig.compileString(r4.toString());
        }
        return new EnumValues(cls, serializableStringArr);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public EnumMap<?, SerializableString> internalMap() {
        EnumMap<?, SerializableString> enumMap = this._asMap;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r4 : this._values) {
            linkedHashMap.put(r4, this._textual[r4.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public SerializableString serializedValueFor(Enum<?> r2) {
        return this._textual[r2.ordinal()];
    }

    public Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }
}
