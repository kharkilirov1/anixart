package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ReaderBasedJsonParser extends ParserBase {
    public boolean _bufferRecyclable;
    public final int _hashSeed;
    public char[] _inputBuffer;
    public int _nameStartCol;
    public long _nameStartOffset;
    public int _nameStartRow;
    public ObjectCodec _objectCodec;
    public Reader _reader;
    public final CharsToNameCanonicalizer _symbols;
    public boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i3, int i4, boolean z) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) throws IOException {
        if (Character.isJavaIdentifierPart((char) i3)) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    private void _closeScope(int i2) throws JsonParseException {
        if (i2 == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i2, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i2 == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i2, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String _handleOddName2(int r5, int r6, int[] r7) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            char[] r1 = r4._inputBuffer
            int r2 = r4._inputPtr
            int r2 = r2 - r5
            r0.resetWithShared(r1, r5, r2)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.getCurrentSegment()
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            int r0 = r0.getCurrentSegmentSize()
            int r1 = r7.length
        L17:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L24
            boolean r2 = r4._loadMore()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4._inputBuffer
            int r3 = r4._inputPtr
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r0)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r7 = r5.getTextBuffer()
            int r0 = r5.getTextOffset()
            int r5 = r5.size()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r4._symbols
            java.lang.String r5 = r1.findSymbol(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4._inputPtr
            int r3 = r3 + 1
            r4._inputPtr = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.finishCurrentSegment()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _isNextTokenNameYes(int i2) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i2 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i2 == 45) {
            this._nextToken = _parseNegNumber();
            return;
        }
        if (i2 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i2 == 102) {
            _matchToken("false", 1);
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i2 == 116) {
            _matchToken("true", 1);
            this._nextToken = JsonToken.VALUE_TRUE;
        } else {
            if (i2 == 123) {
                this._nextToken = JsonToken.START_OBJECT;
                return;
            }
            switch (i2) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    this._nextToken = _parsePosNumber(i2);
                    break;
                default:
                    this._nextToken = _handleOddValue(i2);
                    break;
            }
        }
    }

    private final void _matchFalse() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'a') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'l') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 's') {
                        int i6 = i5 + 1;
                        if (cArr[i6] == 'e' && ((c2 = cArr[(i2 = i6 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                            this._inputPtr = i2;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("false", 1);
    }

    private final void _matchNull() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'u') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'l') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 'l' && ((c2 = cArr[(i2 = i5 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                        this._inputPtr = i2;
                        return;
                    }
                }
            }
        }
        _matchToken("null", 1);
    }

    private final void _matchToken2(String str, int i2) throws IOException {
        int i3;
        char c2;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (c2 = this._inputBuffer[this._inputPtr]) >= '0' && c2 != ']' && c2 != '}') {
            _checkMatchEnd(str, i2, c2);
        }
    }

    private final void _matchTrue() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'r') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'u') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 'e' && ((c2 = cArr[(i2 = i5 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                        this._inputPtr = i2;
                        return;
                    }
                }
            }
        }
        _matchToken("true", 1);
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) throws IOException {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i2 != 44) {
            if (i2 == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            }
            if (i2 == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            if (i2 != 93) {
                if (i2 == 102) {
                    _matchToken("false", 1);
                    JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                if (i2 == 110) {
                    _matchToken("null", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                }
                if (i2 == 116) {
                    _matchToken("true", 1);
                    JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
                    this._currToken = jsonToken5;
                    return jsonToken5;
                }
                if (i2 == 123) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    JsonToken jsonToken6 = JsonToken.START_OBJECT;
                    this._currToken = jsonToken6;
                    return jsonToken6;
                }
                switch (i2) {
                    case 48:
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    case 57:
                        JsonToken _parsePosNumber = _parsePosNumber(i2);
                        this._currToken = _parsePosNumber;
                        return _parsePosNumber;
                    default:
                        JsonToken _handleOddValue = _handleOddValue(i2);
                        this._currToken = _handleOddValue;
                        return _handleOddValue;
                }
            }
        }
        if ((this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i2);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x006e -> B:32:0x0050). Please report as a decompilation issue!!! */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    private String _parseName2(int i2, int i3, int i4) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i2, this._inputPtr - i2);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c2 = cArr[i5];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 <= i4) {
                    if (c2 == i4) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i3);
                    }
                    if (c2 < ' ') {
                        _throwUnquotedSpace(c2, "name");
                    }
                }
            }
            i3 = (i3 * 33) + c2;
            int i6 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c2;
            if (i6 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i6;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z, int i2) throws IOException {
        int i3;
        char nextChar;
        boolean z2;
        int i4;
        char nextChar2;
        if (z) {
            i2++;
        }
        this._inputPtr = i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i5 = 0;
        if (z) {
            emptyAndGetCurrentSegment[0] = '-';
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = this._inputPtr;
        if (i6 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i6 + 1;
            nextChar = cArr[i6];
        } else {
            nextChar = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            nextChar = _verifyNoLeadingZeroes();
        }
        int i7 = 0;
        while (nextChar >= '0' && nextChar <= '9') {
            i7++;
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i8 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = nextChar;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                i3 = i8;
                nextChar = 0;
                z2 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            nextChar = cArr2[i9];
            i3 = i8;
        }
        z2 = false;
        if (i7 == 0) {
            return _handleInvalidNumberStart(nextChar, z);
        }
        if (nextChar == '.') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            emptyAndGetCurrentSegment[i3] = nextChar;
            i3++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                nextChar = cArr3[i10];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i4++;
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                emptyAndGetCurrentSegment[i3] = nextChar;
                i3++;
            }
            if (i4 == 0) {
                reportUnexpectedNumberChar(nextChar, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i11 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = nextChar;
            int i12 = this._inputPtr;
            if (i12 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i12 + 1;
                nextChar2 = cArr4[i12];
            } else {
                nextChar2 = getNextChar("expected a digit for number exponent");
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                int i13 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = nextChar2;
                int i14 = this._inputPtr;
                if (i14 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i14 + 1;
                    nextChar2 = cArr5[i14];
                } else {
                    nextChar2 = getNextChar("expected a digit for number exponent");
                }
                i11 = i13;
            }
            nextChar = nextChar2;
            int i15 = 0;
            while (nextChar <= '9' && nextChar >= '0') {
                i15++;
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                i3 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i5 = i15;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                nextChar = cArr6[i16];
                i11 = i3;
            }
            i5 = i15;
            i3 = i11;
            if (i5 == 0) {
                reportUnexpectedNumberChar(nextChar, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i3);
        return reset(z, i7, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x004b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int _skipAfterComma2() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto L2a
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto Ld
            goto L2a
        Ld:
            java.lang.String r0 = "Unexpected end-of-input within/between "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            com.fasterxml.jackson.core.json.JsonReadContext r1 = r3._parsingContext
            java.lang.String r1 = r1.typeDesc()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r0 = r3._constructError(r0)
            throw r0
        L2a:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L4c
            r1 = 47
            if (r0 != r1) goto L40
            r3._skipComment()
            goto L0
        L40:
            r1 = 35
            if (r0 != r1) goto L4b
            boolean r1 = r3._skipYAMLComment()
            if (r1 == 0) goto L4b
            goto L0
        L4b:
            return r0
        L4c:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L5b
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L5b:
            r1 = 13
            if (r0 != r1) goto L63
            r3._skipCR()
            goto L0
        L63:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipAfterComma2():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _skipCComment() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3._inputEnd
            if (r2 < r0) goto L2d
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L2d
        L26:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r3._reportInvalidEOF(r1, r0)
            return
        L2d:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3._skipCR()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i2 = this._inputPtr;
        if (i2 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c2 = cArr[i2];
        if (c2 == ':') {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c3 = cArr[i3];
            if (c3 > ' ') {
                if (c3 == '/' || c3 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i3 + 1;
                return c3;
            }
            if (c3 == ' ' || c3 == '\t') {
                int i4 = i3 + 1;
                this._inputPtr = i4;
                char c4 = cArr[i4];
                if (c4 > ' ') {
                    if (c4 == '/' || c4 == '#') {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i4 + 1;
                    return c4;
                }
            }
            return _skipColon2(true);
        }
        if (c2 == ' ' || c2 == '\t') {
            int i5 = i2 + 1;
            this._inputPtr = i5;
            c2 = cArr[i5];
        }
        if (c2 != ':') {
            return _skipColon2(false);
        }
        int i6 = this._inputPtr + 1;
        this._inputPtr = i6;
        char c5 = cArr[i6];
        if (c5 > ' ') {
            if (c5 == '/' || c5 == '#') {
                return _skipColon2(true);
            }
            this._inputPtr = i6 + 1;
            return c5;
        }
        if (c5 == ' ' || c5 == '\t') {
            int i7 = i6 + 1;
            this._inputPtr = i7;
            char c6 = cArr[i7];
            if (c6 > ' ') {
                if (c6 == '/' || c6 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i7 + 1;
                return c6;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                StringBuilder m24u = C0000a.m24u(" within/between ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportInvalidEOF(m24u.toString(), null);
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else if (c2 != '#' || !_skipYAMLComment()) {
                    if (z) {
                        return c2;
                    }
                    if (c2 != ':') {
                        _reportUnexpectedChar(c2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private final int _skipColonFast(int i2) throws IOException {
        char[] cArr = this._inputBuffer;
        int i3 = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == ':') {
            int i4 = i3 + 1;
            char c3 = cArr[i3];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    this._inputPtr = i4;
                    return c3;
                }
            } else if (c3 == ' ' || c3 == '\t') {
                int i5 = i4 + 1;
                char c4 = cArr[i4];
                if (c4 > ' ' && c4 != '/' && c4 != '#') {
                    this._inputPtr = i5;
                    return c4;
                }
                i4 = i5;
            }
            this._inputPtr = i4 - 1;
            return _skipColon2(true);
        }
        if (c2 == ' ' || c2 == '\t') {
            int i6 = i3 + 1;
            char c5 = cArr[i3];
            i3 = i6;
            c2 = c5;
        }
        boolean z = c2 == ':';
        if (z) {
            int i7 = i3 + 1;
            char c6 = cArr[i3];
            if (c6 > ' ') {
                if (c6 != '/' && c6 != '#') {
                    this._inputPtr = i7;
                    return c6;
                }
            } else if (c6 == ' ' || c6 == '\t') {
                i3 = i7 + 1;
                char c7 = cArr[i7];
                if (c7 > ' ' && c7 != '/' && c7 != '#') {
                    this._inputPtr = i3;
                    return c7;
                }
            }
            i3 = i7;
        }
        this._inputPtr = i3 - 1;
        return _skipColon2(z);
    }

    private final int _skipComma(int i2) throws IOException {
        if (i2 != 44) {
            StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
            m24u.append(this._parsingContext.typeDesc());
            m24u.append(" entries");
            _reportUnexpectedChar(i2, m24u.toString());
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                return _skipAfterComma2();
            }
            char[] cArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            char c2 = cArr[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this._inputPtr = i4 - 1;
                return _skipAfterComma2();
            }
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '/') {
            _skipLine();
        } else if (c2 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c2, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (c2 == '\r') {
                    _skipCR();
                    return;
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        char c2 = cArr[i2];
        if (c2 > ' ') {
            if (c2 != '/' && c2 != '#') {
                return c2;
            }
            this._inputPtr = i3 - 1;
            return _skipWSOrEnd2();
        }
        if (c2 != ' ') {
            if (c2 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (c2 == '\r') {
                _skipCR();
            } else if (c2 != '\t') {
                _throwInvalidSpace(c2);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            char[] cArr2 = this._inputBuffer;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            char c3 = cArr2[i4];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    return c3;
                }
                this._inputPtr = i5 - 1;
                return _skipWSOrEnd2();
            }
            if (c3 != ' ') {
                if (c3 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (c3 == '\r') {
                    _skipCR();
                } else if (c3 != '\t') {
                    _throwInvalidSpace(c3);
                }
            }
        }
    }

    private int _skipWSOrEnd2() throws IOException {
        char c2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else if (c2 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c2 != ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
        return c2;
    }

    private boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private char _verifyNLZ2() throws IOException {
        char c2;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c2 = this._inputBuffer[this._inputPtr]) < '0' || c2 > '9') {
            return '0';
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c2 == '0') {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                c2 = cArr[i2];
                if (c2 < '0' || c2 > '9') {
                    return '0';
                }
                this._inputPtr = i2 + 1;
            } while (c2 == '0');
        }
        return c2;
    }

    private final char _verifyNoLeadingZeroes() throws IOException {
        char c2;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd || ((c2 = this._inputBuffer[i2]) >= '0' && c2 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i2) throws IOException {
        int i3 = this._inputPtr + 1;
        this._inputPtr = i3;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i2 == 13) {
                _skipCR();
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    public byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char < 0) {
                    if (c2 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                char c3 = cArr2[i3];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c4 = cArr3[i5];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c4 == '\"') {
                            _getByteArrayBuilder.append(i4 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        char c5 = cArr4[i6];
                        if (!base64Variant.usesPaddingChar(c5) && _decodeBase64Escape(base64Variant, c5, 3) != -2) {
                            StringBuilder m24u = C0000a.m24u("expected padding character '");
                            m24u.append(base64Variant.getPaddingChar());
                            m24u.append("'");
                            throw reportInvalidBase64Char(base64Variant, c5, 3, m24u.toString());
                        }
                        _getByteArrayBuilder.append(i4 >> 4);
                    }
                }
                int i7 = (i4 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c6 = cArr5[i8];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c6 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i7 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '\"' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            return _handleUnrecognizedCharacterEscape(c2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c3 = cArr2[i5];
            int charToHex = CharTypes.charToHex(c3);
            if (charToHex < 0) {
                _reportUnexpectedChar(c3, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | charToHex;
        }
        return (char) i3;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void _finishString() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        if (i2 < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i2];
                if (c2 >= length || iArr[c2] == 0) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                } else if (c2 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i4 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i4, i2 - i4);
                    this._inputPtr = i2 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i5, i2 - i5);
        this._inputPtr = i2;
        _finishString2();
    }

    public void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 < length && iArr[c2] != 0) {
                if (c2 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 < ' ') {
                    _throwUnquotedSpace(c2, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c2;
            currentSegmentSize++;
        }
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        return m5359id != 5 ? (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 <= '\'') {
                    if (c2 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c2 < ' ') {
                        _throwUnquotedSpace(c2, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c2;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    public String _handleOddName(int i2) throws IOException {
        if (i2 == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i2, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (!(i2 < length ? inputCodeLatin1JsNames[i2] == 0 : Character.isJavaIdentifierPart((char) i2))) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i3 = this._inputPtr;
        int i4 = this._hashSeed;
        int i5 = this._inputEnd;
        if (i3 < i5) {
            do {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i3];
                if (c2 < length) {
                    if (inputCodeLatin1JsNames[c2] != 0) {
                        int i6 = this._inputPtr - 1;
                        this._inputPtr = i3;
                        return this._symbols.findSymbol(cArr, i6, i3 - i6, i4);
                    }
                } else if (!Character.isJavaIdentifierPart(c2)) {
                    int i7 = this._inputPtr - 1;
                    this._inputPtr = i3;
                    return this._symbols.findSymbol(this._inputBuffer, i7, i3 - i7, i4);
                }
                i4 = (i4 * 33) + c2;
                i3++;
            } while (i3 < i5);
        }
        int i8 = this._inputPtr - 1;
        this._inputPtr = i3;
        return _handleOddName2(i8, i4, inputCodeLatin1JsNames);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r4 != 44) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L86
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L6d
            r0 = 78
            if (r4 == r0) goto L54
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L92
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L45
            goto L92
        L45:
            int r0 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r2
            if (r0 == 0) goto L92
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L54:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L67
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L67:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L92
        L6d:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L80
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L80:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L92
        L86:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L92
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L92:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lad
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lad:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public boolean _isNextTokenNameMaybe(int i2, String str) throws IOException {
        JsonToken _parseNegNumber;
        String _parseName = i2 == 34 ? _parseName() : _handleOddName(i2);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(_parseName);
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return str.equals(_parseName);
    }

    public boolean _loadMore() throws IOException {
        int i2 = this._inputEnd;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                long j2 = i2;
                this._currInputProcessed += j2;
                this._currInputRowStart -= i2;
                this._nameStartOffset -= j2;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder m24u = C0000a.m24u("Reader returned 0 characters when trying to read ");
                m24u.append(this._inputEnd);
                throw new IOException(m24u.toString());
            }
        }
        return false;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchToken(String str, int i2) throws IOException {
        int i3;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        char c2 = this._inputBuffer[i3];
        if (c2 < '0' || c2 == ']' || c2 == '}') {
            return;
        }
        _checkMatchEnd(str, i2, c2);
    }

    public String _parseAposName() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i2];
                if (c2 != '\'') {
                    if (c2 < length && iArr[c2] != 0) {
                        break;
                    }
                    i3 = (i3 * 33) + c2;
                    i2++;
                } else {
                    int i5 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return this._symbols.findSymbol(cArr, i5, i2 - i5, i3);
                }
            } while (i2 < i4);
        }
        int i6 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i6, i3, 39);
    }

    public final String _parseName() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i2 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c2 = cArr[i2];
            if (c2 >= iArr.length || iArr[c2] == 0) {
                i3 = (i3 * 33) + c2;
                i2++;
            } else if (c2 == '\"') {
                int i4 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return this._symbols.findSymbol(cArr, i4, i2 - i4, i3);
            }
        }
        int i5 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i5, i3, 34);
    }

    public final JsonToken _parseNegNumber() throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i2 >= i4) {
            return _parseNumber2(true, i3);
        }
        int i5 = i2 + 1;
        char c2 = this._inputBuffer[i2];
        if (c2 > '9' || c2 < '0') {
            this._inputPtr = i5;
            return _handleInvalidNumberStart(c2, true);
        }
        if (c2 == '0') {
            return _parseNumber2(true, i3);
        }
        int i6 = 1;
        while (i5 < i4) {
            int i7 = i5 + 1;
            char c3 = this._inputBuffer[i5];
            if (c3 < '0' || c3 > '9') {
                if (c3 == '.' || c3 == 'e' || c3 == 'E') {
                    this._inputPtr = i7;
                    return _parseFloat(c3, i3, i7, true, i6);
                }
                int i8 = i7 - 1;
                this._inputPtr = i8;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c3);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i3, i8 - i3);
                return resetInt(true, i6);
            }
            i6++;
            i5 = i7;
        }
        return _parseNumber2(true, i3);
    }

    public final JsonToken _parsePosNumber(int i2) throws IOException {
        int i3 = this._inputPtr;
        int i4 = i3 - 1;
        int i5 = this._inputEnd;
        if (i2 == 48) {
            return _parseNumber2(false, i4);
        }
        int i6 = 1;
        while (i3 < i5) {
            int i7 = i3 + 1;
            char c2 = this._inputBuffer[i3];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i7;
                    return _parseFloat(c2, i4, i7, false, i6);
                }
                int i8 = i7 - 1;
                this._inputPtr = i8;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c2);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i4, i8 - i4);
                return resetInt(false, i6);
            }
            i6++;
            i3 = i7;
        }
        this._inputPtr = i4;
        return _parseNumber2(false, i4);
    }

    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i2 = 3;
        int length = bArr.length - 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c2 = cArr[i5];
            if (c2 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char < 0) {
                    if (c2 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (i3 > length) {
                    i4 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                char c3 = cArr2[i6];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i7 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c4 = cArr3[i8];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c4 == '\"') {
                            int i9 = i3 + 1;
                            bArr[i3] = (byte) (i7 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i3 = i9;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        char c5 = cArr4[i10];
                        if (!base64Variant.usesPaddingChar(c5) && _decodeBase64Escape(base64Variant, c5, i2) != -2) {
                            StringBuilder m24u = C0000a.m24u("expected padding character '");
                            m24u.append(base64Variant.getPaddingChar());
                            m24u.append("'");
                            throw reportInvalidBase64Char(base64Variant, c5, i2, m24u.toString());
                        }
                        bArr[i3] = (byte) (i7 >> 4);
                        i3++;
                    }
                }
                int i11 = (i7 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                char c6 = cArr5[i12];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c6 == '\"') {
                            int i13 = i11 >> 2;
                            int i14 = i3 + 1;
                            bArr[i3] = (byte) (i13 >> 8);
                            i3 = i14 + 1;
                            bArr[i14] = (byte) i13;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i15 = i11 >> 2;
                        int i16 = i3 + 1;
                        bArr[i3] = (byte) (i15 >> 8);
                        i3 = i16 + 1;
                        bArr[i16] = (byte) i15;
                    }
                }
                int i17 = (i11 << 6) | decodeBase64Char4;
                int i18 = i3 + 1;
                bArr[i3] = (byte) (i17 >> 16);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (i17 >> 8);
                bArr[i19] = (byte) i17;
                i3 = i19 + 1;
            }
            i2 = 3;
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i4;
        }
        int i20 = i4 + i3;
        outputStream.write(bArr, 0, i3);
        return i20;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (cArr[i2] == '\n') {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i2 >= i3) {
                this._inputPtr = i2;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    this._inputPtr = i4;
                    _decodeEscaped();
                    i2 = this._inputPtr;
                    i3 = this._inputEnd;
                } else if (c2 <= '\"') {
                    if (c2 == '\"') {
                        this._inputPtr = i4;
                        return;
                    } else if (c2 < ' ') {
                        this._inputPtr = i4;
                        _throwUnquotedSpace(c2, "string value");
                    }
                }
            }
            i2 = i4;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            StringBuilder m24u = C0000a.m24u("Current token (");
            m24u.append(this._currToken);
            m24u.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            _reportError(m24u.toString());
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._reader;
    }

    @Deprecated
    public char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id != 5) {
            if (m5359id != 6) {
                if (m5359id != 7 && m5359id != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (m5359id != 6) {
            if (m5359id != 7 && m5359id != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.m5359id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_getSourceReference(), -1L, (this._nameStartOffset - 1) + this._currInputProcessed, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Boolean nextBooleanValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            JsonToken nextToken = nextToken();
            if (nextToken != null) {
                int m5359id = nextToken.m5359id();
                if (m5359id == 9) {
                    return Boolean.TRUE;
                }
                if (m5359id == 10) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i2 = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return false;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return false;
        }
        _updateNameLocation();
        if (_skipWSOrEnd == 34) {
            char[] asQuotedChars = serializableString.asQuotedChars();
            int length = asQuotedChars.length;
            int i3 = this._inputPtr;
            if (i3 + length + 4 < this._inputEnd) {
                int i4 = length + i3;
                if (this._inputBuffer[i4] == '\"') {
                    while (i3 != i4) {
                        if (asQuotedChars[i2] == this._inputBuffer[i3]) {
                            i2++;
                            i3++;
                        }
                    }
                    this._parsingContext.setCurrentName(serializableString.getValue());
                    _isNextTokenNameYes(_skipColonFast(i3 + 1));
                    return true;
                }
            }
        }
        return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i2;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long nextLongValue(long j2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j2;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = jsonToken3;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd != 110) {
            if (_skipWSOrEnd != 116) {
                if (_skipWSOrEnd == 123) {
                    if (!inObject) {
                        this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    }
                    jsonToken = JsonToken.START_OBJECT;
                } else if (_skipWSOrEnd != 125) {
                    switch (_skipWSOrEnd) {
                        case 48:
                        case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        case 57:
                            jsonToken = _parsePosNumber(_skipWSOrEnd);
                            break;
                        default:
                            jsonToken = _handleOddValue(_skipWSOrEnd);
                            break;
                    }
                } else {
                    _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                }
            }
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(Writer writer) throws IOException {
        int i2 = this._inputEnd;
        int i3 = this._inputPtr;
        int i4 = i2 - i3;
        if (i4 < 1) {
            return 0;
        }
        writer.write(this._inputBuffer, i3, i4);
        return i4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c2 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c2)) {
                break;
            }
            this._inputPtr++;
            sb.append(c2);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return cArr[i2];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] asCharArray = jsonToken.asCharArray();
        writer.write(asCharArray);
        return asCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd != 93 && _skipWSOrEnd != 125) {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                _parseNegNumber = _parseNegNumber();
            } else if (_skipColon == 91) {
                _parseNegNumber = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                _parseNegNumber = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                _parseNegNumber = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                _parseNegNumber = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    case 57:
                        _parseNegNumber = _parsePosNumber(_skipColon);
                        break;
                    default:
                        _parseNegNumber = _handleOddValue(_skipColon);
                        break;
                }
            } else {
                _parseNegNumber = JsonToken.START_OBJECT;
            }
            this._nextToken = _parseNegNumber;
            return _parseName;
        }
        _closeScope(_skipWSOrEnd);
        return null;
    }
}
