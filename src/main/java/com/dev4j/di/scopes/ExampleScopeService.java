/**
 * 
 */
package com.dev4j.di.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author mac
 *
 */
@Service
@Scope("prototype") // Se agrega el scope de tipo prototype.
public class ExampleScopeService {

}
