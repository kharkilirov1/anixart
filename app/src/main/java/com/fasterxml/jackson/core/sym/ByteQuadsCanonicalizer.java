package com.fasterxml.jackson.core.sym;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ByteQuadsCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    public static final int MAX_ENTRIES_FOR_REUSE = 6000;
    private static final int MAX_T_SIZE = 65536;
    private static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 65599;
    private static final int MULT3 = 31;
    private int _count;
    private final boolean _failOnDoS;
    private int[] _hashArea;
    private boolean _hashShared;
    private int _hashSize;
    private boolean _intern;
    private int _longNameOffset;
    private String[] _names;
    private final ByteQuadsCanonicalizer _parent;
    private int _secondaryStart;
    private final int _seed;
    private int _spilloverEnd;
    private final AtomicReference<TableInfo> _tableInfo;
    private int _tertiaryShift;
    private int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i2, boolean z, int i3, boolean z2) {
        this._parent = null;
        this._seed = i3;
        this._intern = z;
        this._failOnDoS = z2;
        int i4 = 16;
        if (i2 < 16) {
            i2 = 16;
        } else if (((i2 - 1) & i2) != 0) {
            while (i4 < i2) {
                i4 += i4;
            }
            i2 = i4;
        }
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i2));
    }

    private int _appendLongName(int[] iArr, int i2) {
        int i3 = this._longNameOffset;
        int i4 = i3 + i2;
        int[] iArr2 = this._hashArea;
        if (i4 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, Math.max(i4 - iArr2.length, Math.min(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, this._hashSize)) + this._hashArea.length);
        }
        System.arraycopy(iArr, 0, this._hashArea, i3, i2);
        this._longNameOffset += i2;
        return i3;
    }

    private final int _calcOffset(int i2) {
        return (i2 & (this._hashSize - 1)) << 2;
    }

    public static int _calcTertiaryShift(int i2) {
        int i3 = i2 >> 2;
        if (i3 < 64) {
            return 4;
        }
        if (i3 <= 256) {
            return 5;
        }
        return i3 <= 1024 ? 6 : 7;
    }

    private boolean _checkNeedForRehash() {
        if (this._count <= (this._hashSize >> 1)) {
            return false;
        }
        int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
        int i2 = this._count;
        return _spilloverStart > ((i2 + 1) >> 7) || ((double) i2) > ((double) this._hashSize) * 0.8d;
    }

    private int _findOffsetForAdd(int i2) {
        int _calcOffset = _calcOffset(i2);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        if (_checkNeedForRehash()) {
            return _resizeAndFindOffsetForAdd(i2);
        }
        int i3 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((_calcOffset >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this._spilloverEnd;
        int i9 = i8 + 4;
        this._spilloverEnd = i9;
        if (i9 < (this._hashSize << 3)) {
            return i8;
        }
        if (this._failOnDoS) {
            _reportTooManyCollisions();
        }
        return _resizeAndFindOffsetForAdd(i2);
    }

    private String _findSecondary(int i2, int i3) {
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((i2 >> (i5 + 2)) << i5);
        int[] iArr = this._hashArea;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i3 == iArr[i6] && 1 == i8) {
                return this._names[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i3 == iArr[_spilloverStart] && 1 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    private int _resizeAndFindOffsetForAdd(int i2) {
        rehash();
        int _calcOffset = _calcOffset(i2);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        int i3 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this._tertiaryStart;
        int i5 = this._tertiaryShift;
        int i6 = i4 + ((_calcOffset >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this._spilloverEnd;
        this._spilloverEnd = i8 + 4;
        return i8;
    }

    private final int _spilloverStart() {
        int i2 = this._hashSize;
        return (i2 << 3) - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean _verifyLongName(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5._hashArea
            r1 = 0
            r2 = 1
            switch(r7) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r5._verifyLongName2(r6, r7, r8)
            return r6
        Lc:
            r7 = r6[r1]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L15
            return r1
        L15:
            r8 = r3
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L24
            return r1
        L24:
            r8 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L32
            return r1
        L32:
            r8 = r4
            goto L35
        L34:
            r7 = 0
        L35:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L40
            return r1
        L40:
            r8 = r4
            goto L43
        L42:
            r3 = 0
        L43:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L4e
            return r1
        L4e:
            int r8 = r7 + 1
            r7 = r6[r7]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L59
            return r1
        L59:
            int r7 = r8 + 1
            r8 = r6[r8]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r8 == r3) goto L64
            return r1
        L64:
            r6 = r6[r7]
            r7 = r0[r4]
            if (r6 == r7) goto L6b
            return r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            if (iArr[i4] != this._hashArea[i3]) {
                return false;
            }
            if (i5 >= i2) {
                return true;
            }
            i4 = i5;
            i3 = i6;
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i2 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i2 == tableInfo2.count) {
            return;
        }
        if (i2 > 6000) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    private void nukeSymbols(boolean z) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i2 = this._hashSize;
        int i3 = this._count;
        int i4 = i2 + i2;
        int i5 = this._spilloverEnd;
        if (i4 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i2 << 3)];
        this._hashSize = i4;
        int i6 = i4 << 2;
        this._secondaryStart = i6;
        this._tertiaryStart = i6 + (i6 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i4);
        this._names = new String[strArr.length << 1];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i9 != 0) {
                i7++;
                String str = strArr[i8 >> 2];
                if (i9 == 1) {
                    iArr2[0] = iArr[i8];
                    addName(str, iArr2, 1);
                } else if (i9 == 2) {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    addName(str, iArr2, 2);
                } else if (i9 != 3) {
                    if (i9 > iArr2.length) {
                        iArr2 = new int[i9];
                    }
                    System.arraycopy(iArr, iArr[i8 + 1], iArr2, 0, i9);
                    addName(str, iArr2, i9);
                } else {
                    iArr2[0] = iArr[i8];
                    iArr2[1] = iArr[i8 + 1];
                    iArr2[2] = iArr[i8 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i7 != i3) {
            throw new IllegalStateException(C0000a.m9f("Failed rehash(): old count=", i3, ", copyCount=", i7));
        }
    }

    public void _reportTooManyCollisions() {
        if (this._hashSize <= 1024) {
            return;
        }
        StringBuilder m24u = C0000a.m24u("Spill-over slots in symbol table with ");
        m24u.append(this._count);
        m24u.append(" entries, hash area of ");
        m24u.append(this._hashSize);
        m24u.append(" slots is now full (all ");
        throw new IllegalStateException(C0000a.m18o(m24u, this._hashSize >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public String addName(String str, int i2) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i2));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i2;
        iArr[_findOffsetForAdd + 3] = 1;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public int bucketCount() {
        return this._hashSize;
    }

    public int calcHash(int i2) {
        int i3 = i2 ^ this._seed;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        return i5 + (i5 >>> 12);
    }

    public String findName(int i2) {
        int _calcOffset = _calcOffset(calcHash(i2));
        int[] iArr = this._hashArea;
        int i3 = iArr[_calcOffset + 3];
        if (i3 == 1) {
            if (iArr[_calcOffset] == i2) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 1) {
            if (iArr[i4] == i2) {
                return this._names[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i2);
    }

    public int hashSeed() {
        return this._seed;
    }

    public ByteQuadsCanonicalizer makeChild(int i2) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i2), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i2), this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i2 = this._secondaryStart;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i2 = this._tertiaryStart;
        int i3 = 0;
        for (int i4 = this._secondaryStart + 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        return atomicReference != null ? atomicReference.get().count : this._count;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i2 = this._tertiaryStart + 3;
        int i3 = this._hashSize + i2;
        int i4 = 0;
        while (i2 < i3) {
            if (this._hashArea[i2] != 0) {
                i4++;
            }
            i2 += 4;
        }
        return i4;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i2 = this._hashSize << 3;
        int i3 = 0;
        for (int i4 = 3; i4 < i2; i4 += 4) {
            if (this._hashArea[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int calcHash(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = this._seed ^ ((i3 * 33) + (i4 ^ (i4 >>> 9)));
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public static ByteQuadsCanonicalizer createRoot(int i2) {
        return new ByteQuadsCanonicalizer(64, true, i2, true);
    }

    public int calcHash(int i2, int i3, int i4) {
        int i5 = i2 ^ this._seed;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public int calcHash(int[] iArr, int i2) {
        if (i2 >= 4) {
            int i3 = iArr[0] ^ this._seed;
            int i4 = i3 + (i3 >>> 9) + iArr[1];
            int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
            int i6 = i5 + (i5 >>> 4);
            for (int i7 = 3; i7 < i2; i7++) {
                int i8 = iArr[i7];
                i6 += i8 ^ (i8 >> 21);
            }
            int i9 = i6 * MULT2;
            int i10 = i9 + (i9 >>> 19);
            return (i10 << 5) ^ i10;
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z, int i2, boolean z2, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i2;
        this._intern = z;
        this._failOnDoS = z2;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i3 = tableInfo.size;
        this._hashSize = i3;
        int i4 = i3 << 2;
        this._secondaryStart = i4;
        this._tertiaryStart = i4 + (i4 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._hashShared = true;
    }

    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i2, int i3, int i4, int[] iArr, String[] strArr, int i5, int i6) {
            this.size = i2;
            this.count = i3;
            this.tertiaryShift = i4;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i5;
            this.longNameOffset = i6;
        }

        public static TableInfo createInitial(int i2) {
            int i3 = i2 << 3;
            return new TableInfo(i2, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i2), new int[i3], new String[i2 << 1], i3 - i2, i3);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private String _findSecondary(int i2, int i3, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr = this._hashArea;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i3 == iArr[i7] && i4 == iArr[i7 + 1] && 2 == i9) {
                return this._names[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i3 == iArr[_spilloverStart] && i4 == iArr[_spilloverStart + 1] && 2 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i2, int i3) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(i3 == 0 ? calcHash(i2) : calcHash(i2, i3));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i2;
        iArr[_findOffsetForAdd + 1] = i3;
        iArr[_findOffsetForAdd + 3] = 2;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i2, int i3) {
        int _calcOffset = _calcOffset(calcHash(i2, i3));
        int[] iArr = this._hashArea;
        int i4 = iArr[_calcOffset + 3];
        if (i4 == 2) {
            if (i2 == iArr[_calcOffset] && i3 == iArr[_calcOffset + 1]) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this._names[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i2, i3);
    }

    private String _findSecondary(int i2, int i3, int i4, int i5) {
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((i2 >> (i7 + 2)) << i7);
        int[] iArr = this._hashArea;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i3 == iArr[i8] && i4 == iArr[i8 + 1] && i5 == iArr[i8 + 2] && 3 == i10) {
                return this._names[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i3 == iArr[_spilloverStart] && i4 == iArr[_spilloverStart + 1] && i5 == iArr[_spilloverStart + 2] && 3 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i2, int i3, int i4) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i2, i3, i4));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i2;
        iArr[_findOffsetForAdd + 1] = i3;
        iArr[_findOffsetForAdd + 2] = i4;
        iArr[_findOffsetForAdd + 3] = 3;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i2, int i3, int i4) {
        int _calcOffset = _calcOffset(calcHash(i2, i3, i4));
        int[] iArr = this._hashArea;
        int i5 = iArr[_calcOffset + 3];
        if (i5 == 3) {
            if (i2 == iArr[_calcOffset] && iArr[_calcOffset + 1] == i3 && iArr[_calcOffset + 2] == i4) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this._names[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i2, i3, i4);
    }

    private String _findSecondary(int i2, int i3, int[] iArr, int i4) {
        int i5 = this._tertiaryStart;
        int i6 = this._tertiaryShift;
        int i7 = i5 + ((i2 >> (i6 + 2)) << i6);
        int[] iArr2 = this._hashArea;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr2[i7 + 3];
            if (i3 == iArr2[i7] && i4 == i9 && _verifyLongName(iArr, i4, iArr2[i7 + 1])) {
                return this._names[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i3 == iArr2[_spilloverStart] && i4 == iArr2[_spilloverStart + 3] && _verifyLongName(iArr, i4, iArr2[_spilloverStart + 1])) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int[] iArr, int i2) {
        int _findOffsetForAdd;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i2 == 1) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[_findOffsetForAdd] = iArr[0];
            iArr2[_findOffsetForAdd + 3] = 1;
        } else if (i2 == 2) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[_findOffsetForAdd] = iArr[0];
            iArr3[_findOffsetForAdd + 1] = iArr[1];
            iArr3[_findOffsetForAdd + 3] = 2;
        } else if (i2 != 3) {
            int calcHash = calcHash(iArr, i2);
            _findOffsetForAdd = _findOffsetForAdd(calcHash);
            this._hashArea[_findOffsetForAdd] = calcHash;
            int _appendLongName = _appendLongName(iArr, i2);
            int[] iArr4 = this._hashArea;
            iArr4[_findOffsetForAdd + 1] = _appendLongName;
            iArr4[_findOffsetForAdd + 3] = i2;
        } else {
            int _findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[_findOffsetForAdd2] = iArr[0];
            iArr5[_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[_findOffsetForAdd2 + 3] = 3;
            _findOffsetForAdd = _findOffsetForAdd2;
        }
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 1) {
                return findName(iArr[0]);
            }
            if (i2 != 2) {
                return i2 != 3 ? "" : findName(iArr[0], iArr[1], iArr[2]);
            }
            return findName(iArr[0], iArr[1]);
        }
        int calcHash = calcHash(iArr, i2);
        int _calcOffset = _calcOffset(calcHash);
        int[] iArr2 = this._hashArea;
        int i3 = iArr2[_calcOffset + 3];
        if (calcHash == iArr2[_calcOffset] && i3 == i2 && _verifyLongName(iArr, i2, iArr2[_calcOffset + 1])) {
            return this._names[_calcOffset >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (calcHash == iArr2[i4] && i5 == i2 && _verifyLongName(iArr, i2, iArr2[i4 + 1])) {
            return this._names[i4 >> 2];
        }
        return _findSecondary(_calcOffset, calcHash, iArr, i2);
    }
}
