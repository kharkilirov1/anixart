package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class EmojiMetadata {

    /* renamed from: d */
    public static final ThreadLocal<MetadataItem> f4029d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f4030a;

    /* renamed from: b */
    @NonNull
    public final MetadataRepo f4031b;

    /* renamed from: c */
    public volatile int f4032c = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public EmojiMetadata(@NonNull MetadataRepo metadataRepo, @IntRange int i2) {
        this.f4031b = metadataRepo;
        this.f4030a = i2;
    }

    /* renamed from: a */
    public int m2823a(int i2) {
        MetadataItem m2827e = m2827e();
        int m2864a = m2827e.m2864a(16);
        if (m2864a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = m2827e.f4104b;
        int i3 = m2864a + m2827e.f4103a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* renamed from: b */
    public int m2824b() {
        MetadataItem m2827e = m2827e();
        int m2864a = m2827e.m2864a(16);
        if (m2864a == 0) {
            return 0;
        }
        int i2 = m2864a + m2827e.f4103a;
        return m2827e.f4104b.getInt(m2827e.f4104b.getInt(i2) + i2);
    }

    /* renamed from: c */
    public short m2825c() {
        MetadataItem m2827e = m2827e();
        int m2864a = m2827e.m2864a(14);
        if (m2864a != 0) {
            return m2827e.f4104b.getShort(m2864a + m2827e.f4103a);
        }
        return (short) 0;
    }

    /* renamed from: d */
    public int m2826d() {
        MetadataItem m2827e = m2827e();
        int m2864a = m2827e.m2864a(4);
        if (m2864a != 0) {
            return m2827e.f4104b.getInt(m2864a + m2827e.f4103a);
        }
        return 0;
    }

    /* renamed from: e */
    public final MetadataItem m2827e() {
        ThreadLocal<MetadataItem> threadLocal = f4029d;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        MetadataList metadataList = this.f4031b.f4063a;
        int i2 = this.f4030a;
        int m2864a = metadataList.m2864a(6);
        if (m2864a != 0) {
            int i3 = m2864a + metadataList.f4103a;
            int i4 = (i2 * 4) + metadataList.f4104b.getInt(i3) + i3 + 4;
            metadataItem.m2865b(metadataList.f4104b.getInt(i4) + i4, metadataList.f4104b);
        }
        return metadataItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m2826d()));
        sb.append(", codepoints:");
        int m2824b = m2824b();
        for (int i2 = 0; i2 < m2824b; i2++) {
            sb.append(Integer.toHexString(m2823a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
