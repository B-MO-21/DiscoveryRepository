package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private AccountTypeTranslator translator;

    @InjectMocks
    private CreateAccountTypeFlowImpl flow;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        doThrow(new RuntimeException()).when(translator).someMethod();
        try {
            flow.create(new AccountTypeDto());
            fail("Should throw an  exception");
        } catch (Exception e){

        }
        verify(translator,times(1)).someMethod();
        verify(translator,never()).create(any(AccountTypeDto.class));
    }
}
//When Extracting the Method, I encounter errors that I am unable to fix.