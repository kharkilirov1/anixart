package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {

    /* renamed from: c */
    public static final Pattern f12021c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f12022a = Charsets.f20504c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f12023b = Charsets.f20503b.newDecoder();

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    /* renamed from: b */
    public Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f12022a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f12023b.decode(byteBuffer).toString();
                this.f12023b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f12023b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f12023b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f12022a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f12021c.matcher(str);
        String str3 = null;
        for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m11123c = Ascii.m11123c(group);
                Objects.requireNonNull(m11123c);
                if (m11123c.equals("streamurl")) {
                    str3 = group2;
                } else if (m11123c.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
