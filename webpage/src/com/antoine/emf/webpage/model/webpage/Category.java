/**
 */
package com.antoine.emf.webpage.model.webpage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.antoine.emf.webpage.model.webpage.Category#getName <em>Name</em>}</li>
 *   <li>{@link com.antoine.emf.webpage.model.webpage.Category#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see com.antoine.emf.webpage.model.webpage.WebpagePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.antoine.emf.webpage.model.webpage.WebpagePackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.antoine.emf.webpage.model.webpage.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' reference.
	 * @see #setArticles(Article)
	 * @see com.antoine.emf.webpage.model.webpage.WebpagePackage#getCategory_Articles()
	 * @model
	 * @generated
	 */
	Article getArticles();

	/**
	 * Sets the value of the '{@link com.antoine.emf.webpage.model.webpage.Category#getArticles <em>Articles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articles</em>' reference.
	 * @see #getArticles()
	 * @generated
	 */
	void setArticles(Article value);

} // Category
