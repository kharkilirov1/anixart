package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Options.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Companion", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: e */
    public static final Companion f68774e = new Companion(null);

    /* renamed from: c */
    @NotNull
    public final ByteString[] f68775c;

    /* renamed from: d */
    @NotNull
    public final int[] f68776d;

    /* compiled from: Options.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/Options$Companion;", "", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final void m34609a(long j2, Buffer buffer, int i2, List<? extends ByteString> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            Buffer buffer2;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (!(list.get(i10).mo34576d() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i3);
            ByteString byteString2 = list.get(i4 - 1);
            if (i9 == byteString.mo34576d()) {
                int intValue = list2.get(i3).intValue();
                int i11 = i3 + 1;
                ByteString byteString3 = list.get(i11);
                i5 = i11;
                i6 = intValue;
                byteString = byteString3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (byteString.mo34579h(i9) == byteString2.mo34579h(i9)) {
                int min = Math.min(byteString.mo34576d(), byteString2.mo34576d());
                int i12 = 0;
                for (int i13 = i9; i13 < min && byteString.mo34579h(i13) == byteString2.mo34579h(i13); i13++) {
                    i12++;
                }
                long m34610b = m34610b(buffer) + j2 + 2 + i12 + 1;
                buffer.m34532Z(-i12);
                buffer.m34532Z(i6);
                int i14 = i9 + i12;
                while (i9 < i14) {
                    buffer.m34532Z(byteString.mo34579h(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (!(i14 == list.get(i5).mo34576d())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.m34532Z(list2.get(i5).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.m34532Z(((int) (m34610b(buffer3) + m34610b)) * (-1));
                    m34609a(m34610b, buffer3, i14, list, i5, i4, list2);
                    buffer.mo34569z0(buffer3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i5 + 1; i16 < i4; i16++) {
                if (list.get(i16 - 1).mo34579h(i9) != list.get(i16).mo34579h(i9)) {
                    i15++;
                }
            }
            long m34610b2 = m34610b(buffer) + j2 + 2 + (i15 * 2);
            buffer.m34532Z(i15);
            buffer.m34532Z(i6);
            for (int i17 = i5; i17 < i4; i17++) {
                byte mo34579h = list.get(i17).mo34579h(i9);
                if (i17 == i5 || mo34579h != list.get(i17 - 1).mo34579h(i9)) {
                    buffer.m34532Z(mo34579h & 255);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i5 < i4) {
                byte mo34579h2 = list.get(i5).mo34579h(i9);
                int i18 = i5 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (mo34579h2 != list.get(i19).mo34579h(i9)) {
                            i7 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i7 && i9 + 1 == list.get(i5).mo34576d()) {
                    buffer.m34532Z(list2.get(i5).intValue());
                    i8 = i7;
                    buffer2 = buffer4;
                } else {
                    buffer.m34532Z(((int) (m34610b(buffer4) + m34610b2)) * (-1));
                    i8 = i7;
                    buffer2 = buffer4;
                    m34609a(m34610b2, buffer4, i9 + 1, list, i5, i7, list2);
                }
                buffer4 = buffer2;
                i5 = i8;
            }
            buffer.mo34569z0(buffer4);
        }

        /* renamed from: b */
        public final long m34610b(Buffer buffer) {
            return buffer.f68742c / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options m34611c(@org.jetbrains.annotations.NotNull okio.ByteString... r15) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.m34611c(okio.ByteString[]):okio.Options");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f68775c = byteStringArr;
        this.f68776d = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF63156f() {
        return this.f68775c.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i2) {
        return this.f68775c[i2];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
