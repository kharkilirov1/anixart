package com.google.gson.internal.bind;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class JsonTreeReader extends JsonReader {

    /* renamed from: u */
    public static final Object f23774u;

    /* renamed from: q */
    public Object[] f23775q;

    /* renamed from: r */
    public int f23776r;

    /* renamed from: s */
    public String[] f23777s;

    /* renamed from: t */
    public int[] f23778t;

    static {
        new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i2, int i3) throws IOException {
                throw new AssertionError();
            }
        };
        f23774u = new Object();
    }

    /* renamed from: l */
    private String m12896l() {
        StringBuilder m24u = C0000a.m24u(" at path ");
        m24u.append(mo12914t());
        return m24u.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: A */
    public String mo12897A() throws IOException {
        JsonToken mo12898C = mo12898C();
        JsonToken jsonToken = JsonToken.STRING;
        if (mo12898C == jsonToken || mo12898C == JsonToken.NUMBER) {
            String mo12841g = ((JsonPrimitive) m12910o0()).mo12841g();
            int i2 = this.f23776r;
            if (i2 > 0) {
                int[] iArr = this.f23778t;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return mo12841g;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12898C + m12896l());
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: C */
    public JsonToken mo12898C() throws IOException {
        if (this.f23776r == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object m12908n0 = m12908n0();
        if (m12908n0 instanceof Iterator) {
            boolean z = this.f23775q[this.f23776r - 2] instanceof JsonObject;
            Iterator it = (Iterator) m12908n0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m12913s0(it.next());
            return mo12898C();
        }
        if (m12908n0 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (m12908n0 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(m12908n0 instanceof JsonPrimitive)) {
            if (m12908n0 instanceof JsonNull) {
                return JsonToken.NULL;
            }
            if (m12908n0 == f23774u) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((JsonPrimitive) m12908n0).f23669a;
        if (obj instanceof String) {
            return JsonToken.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: Z */
    public void mo12899Z() throws IOException {
        if (mo12898C() == JsonToken.NAME) {
            mo12912q();
            this.f23777s[this.f23776r - 2] = "null";
        } else {
            m12910o0();
            int i2 = this.f23776r;
            if (i2 > 0) {
                this.f23777s[i2 - 1] = "null";
            }
        }
        int i3 = this.f23776r;
        if (i3 > 0) {
            int[] iArr = this.f23778t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: a */
    public void mo12900a() throws IOException {
        m12902d0(JsonToken.BEGIN_ARRAY);
        m12913s0(((JsonArray) m12908n0()).iterator());
        this.f23778t[this.f23776r - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: b */
    public void mo12901b() throws IOException {
        m12902d0(JsonToken.BEGIN_OBJECT);
        m12913s0(((JsonObject) m12908n0()).f23668a.entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23775q = new Object[]{f23774u};
        this.f23776r = 1;
    }

    /* renamed from: d0 */
    public final void m12902d0(JsonToken jsonToken) throws IOException {
        if (mo12898C() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12898C() + m12896l());
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: g */
    public void mo12903g() throws IOException {
        m12902d0(JsonToken.END_ARRAY);
        m12910o0();
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: h */
    public void mo12904h() throws IOException {
        m12902d0(JsonToken.END_OBJECT);
        m12910o0();
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: j */
    public boolean mo12905j() throws IOException {
        JsonToken mo12898C = mo12898C();
        return (mo12898C == JsonToken.END_OBJECT || mo12898C == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: m */
    public boolean mo12906m() throws IOException {
        m12902d0(JsonToken.BOOLEAN);
        boolean m12848r = ((JsonPrimitive) m12910o0()).m12848r();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return m12848r;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: n */
    public double mo12907n() throws IOException {
        JsonToken mo12898C = mo12898C();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo12898C != jsonToken && mo12898C != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12898C + m12896l());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m12908n0();
        double doubleValue = jsonPrimitive.f23669a instanceof Number ? jsonPrimitive.m12849s().doubleValue() : Double.parseDouble(jsonPrimitive.mo12841g());
        if (!this.f23889c && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return doubleValue;
    }

    /* renamed from: n0 */
    public final Object m12908n0() {
        return this.f23775q[this.f23776r - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: o */
    public int mo12909o() throws IOException {
        JsonToken mo12898C = mo12898C();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo12898C != jsonToken && mo12898C != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12898C + m12896l());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m12908n0();
        int intValue = jsonPrimitive.f23669a instanceof Number ? jsonPrimitive.m12849s().intValue() : Integer.parseInt(jsonPrimitive.mo12841g());
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return intValue;
    }

    /* renamed from: o0 */
    public final Object m12910o0() {
        Object[] objArr = this.f23775q;
        int i2 = this.f23776r - 1;
        this.f23776r = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: p */
    public long mo12911p() throws IOException {
        JsonToken mo12898C = mo12898C();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo12898C != jsonToken && mo12898C != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12898C + m12896l());
        }
        long mo12840f = ((JsonPrimitive) m12908n0()).mo12840f();
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return mo12840f;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: q */
    public String mo12912q() throws IOException {
        m12902d0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m12908n0()).next();
        String str = (String) entry.getKey();
        this.f23777s[this.f23776r - 1] = str;
        m12913s0(entry.getValue());
        return str;
    }

    /* renamed from: s0 */
    public final void m12913s0(Object obj) {
        int i2 = this.f23776r;
        Object[] objArr = this.f23775q;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.f23775q = Arrays.copyOf(objArr, i3);
            this.f23778t = Arrays.copyOf(this.f23778t, i3);
            this.f23777s = (String[]) Arrays.copyOf(this.f23777s, i3);
        }
        Object[] objArr2 = this.f23775q;
        int i4 = this.f23776r;
        this.f23776r = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: t */
    public String mo12914t() {
        StringBuilder m2872a = C0321a.m2872a('$');
        int i2 = 0;
        while (true) {
            int i3 = this.f23776r;
            if (i2 >= i3) {
                return m2872a.toString();
            }
            Object[] objArr = this.f23775q;
            if (objArr[i2] instanceof JsonArray) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    m2872a.append('[');
                    m2872a.append(this.f23778t[i2]);
                    m2872a.append(']');
                }
            } else if ((objArr[i2] instanceof JsonObject) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                m2872a.append('.');
                String[] strArr = this.f23777s;
                if (strArr[i2] != null) {
                    m2872a.append(strArr[i2]);
                }
            }
            i2++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        StringBuilder m24u = C0000a.m24u("JsonTreeReader");
        m24u.append(m12896l());
        return m24u.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    /* renamed from: v */
    public void mo12915v() throws IOException {
        m12902d0(JsonToken.NULL);
        m12910o0();
        int i2 = this.f23776r;
        if (i2 > 0) {
            int[] iArr = this.f23778t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }
}
