package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class c10 extends g11 {

    /* renamed from: c */
    private static final Pattern f49062c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f49063a = C5285jh.f51608c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f49064b = C5285jh.f51607b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.g11
    /* renamed from: a */
    public final Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f49063a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f49064b.decode(byteBuffer).toString();
                this.f49064b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f49064b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f49064b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f49063a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f49062c.matcher(str);
        String str3 = null;
        for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m24832b = C5114ga.m24832b(group);
                Objects.requireNonNull(m24832b);
                if (m24832b.equals("streamurl")) {
                    str3 = group2;
                } else if (m24832b.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
