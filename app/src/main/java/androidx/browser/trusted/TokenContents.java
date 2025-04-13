package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class TokenContents {

    /* renamed from: a */
    @NonNull
    public final byte[] f1747a;

    /* renamed from: b */
    @Nullable
    public String f1748b;

    /* renamed from: c */
    @Nullable
    public List<byte[]> f1749c;

    public TokenContents(@NonNull byte[] bArr, @NonNull String str, @NonNull List<byte[]> list) {
        this.f1747a = bArr;
        this.f1748b = str;
        this.f1749c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f1749c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    @NonNull
    /* renamed from: a */
    public static TokenContents m1040a(String str, List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.a
            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    byte[] r5 = (byte[]) r5
                    byte[] r6 = (byte[]) r6
                    r0 = 0
                    if (r5 != r6) goto L8
                    goto L2f
                L8:
                    if (r5 != 0) goto Lc
                    r0 = -1
                    goto L2f
                Lc:
                    if (r6 != 0) goto L10
                    r0 = 1
                    goto L2f
                L10:
                    r1 = 0
                L11:
                    int r2 = r5.length
                    int r3 = r6.length
                    int r2 = java.lang.Math.min(r2, r3)
                    if (r1 >= r2) goto L27
                    r2 = r5[r1]
                    r3 = r6[r1]
                    if (r2 == r3) goto L24
                    r5 = r5[r1]
                    r6 = r6[r1]
                    goto L2d
                L24:
                    int r1 = r1 + 1
                    goto L11
                L27:
                    int r1 = r5.length
                    int r2 = r6.length
                    if (r1 == r2) goto L2f
                    int r5 = r5.length
                    int r6 = r6.length
                L2d:
                    int r0 = r5 - r6
                L2f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.browser.trusted.C0166a.compare(java.lang.Object, java.lang.Object):int");
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new TokenContents(byteArrayOutputStream.toByteArray(), str, list);
    }

    /* renamed from: b */
    public final void m1041b() throws IOException {
        if (this.f1748b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f1747a));
        this.f1748b = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.f1749c = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) != readInt2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f1749c.add(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TokenContents.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1747a, ((TokenContents) obj).f1747a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1747a);
    }
}
