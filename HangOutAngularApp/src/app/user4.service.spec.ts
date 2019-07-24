import { TestBed } from '@angular/core/testing';

import { User4Service } from './user4.service';

describe('User4Service', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: User4Service = TestBed.get(User4Service);
    expect(service).toBeTruthy();
  });
});
