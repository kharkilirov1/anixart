package org.jsoup.parser;

import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.network.Response;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Token;

/* loaded from: classes3.dex */
final class Tokeniser {

    /* renamed from: u */
    public static final char[] f69173u;

    /* renamed from: v */
    public static final int[] f69174v = {8364, 129, 8218, Response.BANNED, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a */
    public final CharacterReader f69175a;

    /* renamed from: b */
    public final ParseErrorList f69176b;

    /* renamed from: o */
    @Nullable
    public String f69189o;

    /* renamed from: p */
    @Nullable
    public String f69190p;

    /* renamed from: q */
    public int f69191q;

    /* renamed from: c */
    public TokeniserState f69177c = TokeniserState.Data;

    /* renamed from: d */
    @Nullable
    public Token f69178d = null;

    /* renamed from: e */
    public boolean f69179e = false;

    /* renamed from: f */
    @Nullable
    public String f69180f = null;

    /* renamed from: g */
    public final StringBuilder f69181g = new StringBuilder(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);

    /* renamed from: h */
    public StringBuilder f69182h = new StringBuilder(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);

    /* renamed from: i */
    public Token.StartTag f69183i = new Token.StartTag();

    /* renamed from: j */
    public Token.EndTag f69184j = new Token.EndTag();

    /* renamed from: k */
    public Token.Tag f69185k = this.f69183i;

    /* renamed from: l */
    public Token.Character f69186l = new Token.Character();

    /* renamed from: m */
    public Token.Doctype f69187m = new Token.Doctype();

    /* renamed from: n */
    public Token.Comment f69188n = new Token.Comment();

    /* renamed from: r */
    public int f69192r = -1;

    /* renamed from: s */
    public final int[] f69193s = new int[1];

    /* renamed from: t */
    public final int[] f69194t = new int[2];

    /* renamed from: org.jsoup.parser.Tokeniser$1 */
    public static /* synthetic */ class C69041 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69195a;

        static {
            int[] iArr = new int[TokeniserState.values().length];
            f69195a = iArr;
            try {
                TokeniserState tokeniserState = TokeniserState.TagOpen;
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f69195a;
                TokeniserState tokeniserState2 = TokeniserState.Data;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f69173u = cArr;
        Arrays.sort(cArr);
    }

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList) {
        this.f69175a = characterReader;
        this.f69176b = parseErrorList;
    }

    /* renamed from: a */
    public final void m34932a(String str, Object... objArr) {
        if (this.f69176b.m34885b()) {
            this.f69176b.add(new ParseError(this.f69175a, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f4, code lost:
    
        if (r13.f69175a.m34828x('=', '-', '_') == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c6  */
    @javax.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] m34933b(@javax.annotation.Nullable java.lang.Character r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.Tokeniser.m34933b(java.lang.Character, boolean):int[]");
    }

    /* renamed from: c */
    public void m34934c() {
        this.f69188n.mo34900g();
        this.f69188n.f69147f = true;
    }

    /* renamed from: d */
    public Token.Tag m34935d(boolean z) {
        Token.Tag tag;
        if (z) {
            tag = this.f69183i;
            tag.mo34900g();
        } else {
            tag = this.f69184j;
            tag.mo34900g();
        }
        this.f69185k = tag;
        return tag;
    }

    /* renamed from: e */
    public void m34936e(char c2) {
        if (this.f69180f == null) {
            this.f69180f = String.valueOf(c2);
        } else {
            if (this.f69181g.length() == 0) {
                this.f69181g.append(this.f69180f);
            }
            this.f69181g.append(c2);
        }
        Token.Character character = this.f69186l;
        character.f69142b = this.f69192r;
        character.f69143c = this.f69175a.m34802B();
    }

    /* renamed from: f */
    public void m34937f(String str) {
        if (this.f69180f == null) {
            this.f69180f = str;
        } else {
            if (this.f69181g.length() == 0) {
                this.f69181g.append(this.f69180f);
            }
            this.f69181g.append(str);
        }
        Token.Character character = this.f69186l;
        character.f69142b = this.f69192r;
        character.f69143c = this.f69175a.m34802B();
    }

    /* renamed from: g */
    public void m34938g(StringBuilder sb) {
        if (this.f69180f == null) {
            this.f69180f = sb.toString();
        } else {
            if (this.f69181g.length() == 0) {
                this.f69181g.append(this.f69180f);
            }
            this.f69181g.append((CharSequence) sb);
        }
        Token.Character character = this.f69186l;
        character.f69142b = this.f69192r;
        character.f69143c = this.f69175a.m34802B();
    }

    /* renamed from: h */
    public void m34939h(Token token) {
        Validate.m34688a(this.f69179e);
        this.f69178d = token;
        this.f69179e = true;
        token.f69142b = this.f69191q;
        token.f69143c = this.f69175a.m34802B();
        this.f69192r = -1;
        Token.TokenType tokenType = token.f69141a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f69189o = ((Token.StartTag) token).f69153d;
            this.f69190p = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.EndTag endTag = (Token.EndTag) token;
            if (endTag.m34914q()) {
                Object[] objArr = {endTag.f69154e};
                if (this.f69176b.m34885b()) {
                    this.f69176b.add(new ParseError(this.f69175a, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    /* renamed from: i */
    public void m34940i() {
        Token.Tag tag = this.f69185k;
        if (tag.f69157h) {
            tag.m34917t();
        }
        m34939h(this.f69185k);
    }

    /* renamed from: j */
    public void m34941j(TokeniserState tokeniserState) {
        if (this.f69176b.m34885b()) {
            this.f69176b.add(new ParseError(this.f69175a, "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    /* renamed from: k */
    public void m34942k(TokeniserState tokeniserState) {
        if (this.f69176b.m34885b()) {
            ParseErrorList parseErrorList = this.f69176b;
            CharacterReader characterReader = this.f69175a;
            parseErrorList.add(new ParseError(characterReader, "Unexpected character '%s' in input state [%s]", Character.valueOf(characterReader.m34818n()), tokeniserState));
        }
    }

    /* renamed from: l */
    public boolean m34943l() {
        return this.f69189o != null && this.f69185k.m34915r().equalsIgnoreCase(this.f69189o);
    }

    /* renamed from: m */
    public void m34944m(TokeniserState tokeniserState) {
        int ordinal = tokeniserState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 7) {
                this.f69191q = this.f69175a.m34802B();
            }
        } else if (this.f69192r == -1) {
            this.f69192r = this.f69175a.m34802B();
        }
        this.f69177c = tokeniserState;
    }
}
