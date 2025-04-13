package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.px */
/* loaded from: classes3.dex */
public final class C5608px {

    /* renamed from: a */
    private final int f53866a;

    /* renamed from: b */
    private final a[] f53867b;

    /* renamed from: c */
    private final b[] f53868c;

    /* renamed from: d */
    private final HashMap f53869d;

    /* renamed from: e */
    private final HashMap f53870e;

    /* renamed from: com.yandex.mobile.ads.impl.px$a */
    public static final class a {

        /* renamed from: a */
        public final String f53871a;

        private a(String str) {
            this.f53871a = str;
        }

        /* renamed from: a */
        public static a m27577a(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr, 0);
            int i4 = iArr[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveAttrib(i2, i3, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (bArr[i5] == 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            String str = new String(bArr, 0, i4);
            GLES20.glGetAttribLocation(i2, str);
            return new a(str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.px$b */
    public static final class b {

        /* renamed from: a */
        public final String f53872a;

        private b(String str) {
            this.f53872a = str;
        }

        /* renamed from: a */
        public static b m27578a(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35719, iArr, 0);
            int i4 = iArr[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveUniform(i2, i3, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (bArr[i5] == 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            String str = new String(bArr, 0, i4);
            GLES20.glGetUniformLocation(i2, str);
            return new b(str);
        }
    }

    public C5608px() {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f53866a = glCreateProgram;
        C5660qx.m27792a();
        m27574a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        m27574a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder m26356a = l60.m26356a("Unable to link shader program: \n");
            m26356a.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            C5660qx.m27793a(m26356a.toString());
        }
        GLES20.glUseProgram(glCreateProgram);
        this.f53869d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f53867b = new a[iArr2[0]];
        for (int i2 = 0; i2 < iArr2[0]; i2++) {
            a m27577a = a.m27577a(this.f53866a, i2);
            this.f53867b[i2] = m27577a;
            this.f53869d.put(m27577a.f53871a, m27577a);
        }
        this.f53870e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f53866a, 35718, iArr3, 0);
        this.f53868c = new b[iArr3[0]];
        for (int i3 = 0; i3 < iArr3[0]; i3++) {
            b m27578a = b.m27578a(this.f53866a, i3);
            this.f53868c[i3] = m27578a;
            this.f53870e.put(m27578a.f53872a, m27578a);
        }
        C5660qx.m27792a();
    }

    /* renamed from: a */
    private static void m27574a(int i2, int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str;
            int i4 = C5660qx.f54142b;
            d90.m23839b("GlUtil", str2);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C5660qx.m27792a();
    }

    /* renamed from: b */
    public final int m27576b(String str) {
        return GLES20.glGetUniformLocation(this.f53866a, str);
    }

    /* renamed from: a */
    public final int m27575a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f53866a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        C5660qx.m27792a();
        return glGetAttribLocation;
    }
}
