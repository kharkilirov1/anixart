package kotlin.p033io;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IOStreams.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
@JvmName
/* loaded from: classes3.dex */
public final class ByteStreamsKt {
    @SinceKotlin
    @NotNull
    /* renamed from: a */
    public static final byte[] m32137a(@NotNull InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST, inputStream.available()));
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.m32178g(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
