/*
 * generated by Xtext 2.9.0
 */
package edu.ufcg.compiladores.pascal.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import edu.ufcg.compiladores.pascal.idea.lang.PascalFileType;
import edu.ufcg.compiladores.pascal.idea.lang.PascalLanguage;
import org.eclipse.xtext.psi.impl.BaseXtextFile;

public final class PascalFileImpl extends BaseXtextFile {

	public PascalFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, PascalLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return PascalFileType.INSTANCE;
	}
}
