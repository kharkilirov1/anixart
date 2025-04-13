package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class JsonPrimitive extends JsonElement {

    /* renamed from: a */
    public final Object f23669a;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f23669a = bool;
    }

    /* renamed from: t */
    public static boolean m12847t(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f23669a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f23669a == null) {
            return jsonPrimitive.f23669a == null;
        }
        if (m12847t(this) && m12847t(jsonPrimitive)) {
            return m12849s().longValue() == jsonPrimitive.m12849s().longValue();
        }
        Object obj2 = this.f23669a;
        if (!(obj2 instanceof Number) || !(jsonPrimitive.f23669a instanceof Number)) {
            return obj2.equals(jsonPrimitive.f23669a);
        }
        double doubleValue = m12849s().doubleValue();
        double doubleValue2 = jsonPrimitive.m12849s().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    /* renamed from: f */
    public long mo12840f() {
        return this.f23669a instanceof Number ? m12849s().longValue() : Long.parseLong(mo12841g());
    }

    @Override // com.google.gson.JsonElement
    /* renamed from: g */
    public String mo12841g() {
        Object obj = this.f23669a;
        return obj instanceof Number ? m12849s().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f23669a == null) {
            return 31;
        }
        if (m12847t(this)) {
            doubleToLongBits = m12849s().longValue();
        } else {
            Object obj = this.f23669a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m12849s().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: r */
    public boolean m12848r() {
        Object obj = this.f23669a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(mo12841g());
    }

    /* renamed from: s */
    public Number m12849s() {
        Object obj = this.f23669a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.f23669a = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.f23669a = str;
    }
}
